package org.ihtsdo.otf.rest.client.traceability;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.ihtsdo.otf.rest.client.ExpressiveErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snomed.otf.traceability.domain.Activity;
import org.snomed.otf.traceability.domain.ActivityType;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.*;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.*;

/**
 * Client can either load a template from the template service, or from a local resource
 */
public class TraceabilityServiceClient {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final HttpHeaders headers;
	private final RestTemplate restTemplate;
	ObjectMapper mapper = new ObjectMapper();
	private static final String CONTENT_TYPE = "application/json";
	
	public TraceabilityServiceClient(String serverUrl, String cookie) {
		headers = new HttpHeaders();
		headers.add("Cookie", cookie);
		headers.add("Accept", CONTENT_TYPE);
		
		restTemplate = new RestTemplateBuilder()
				.rootUri(serverUrl)
				.additionalMessageConverters(new GsonHttpMessageConverter())
				.errorHandler(new ExpressiveErrorHandler())
				.build();
		
		//Add a ClientHttpRequestInterceptor to the RestTemplate
		restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor(){
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
				request.getHeaders().addAll(headers);
				return execution.execute(request, body);
			}
		}); 
	}
	
	public List<Activity> getConceptActivity(List<Long> conceptIds, String commentFilter, ActivityType activityType) {
		String url = "/traceability-service/activitiesBulk?activityType=" + activityType + 
				"&commentFilter="+commentFilter;
		HttpEntity<List<Long>> requestEntity = new HttpEntity<>(conceptIds, headers);
		List<Activity> activities = new ArrayList<>();
		boolean isLast = false;
		int offset = 0;
		ParameterizedTypeReference<RestResponsePage<Activity>> responseType = new ParameterizedTypeReference<RestResponsePage<Activity>>() { };
		while (!isLast) {
			ResponseEntity<RestResponsePage<Activity>> response = restTemplate.exchange(
					url + "&offset=" + offset,
					HttpMethod.POST,
					requestEntity,
					responseType);
			activities.addAll(response.getBody().getContent());
			isLast = response.getBody().isLast();
		}
		return activities;
	}

}
