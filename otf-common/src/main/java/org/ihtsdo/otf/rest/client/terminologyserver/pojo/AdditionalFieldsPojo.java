package org.ihtsdo.otf.rest.client.terminologyserver.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"domainTemplateForPostcoordination", "domainTemplateForPrecoordination", 
	"proximalPrimitiveConstraint", "guideURL", "domainConstraint", "parentDomain", "proximalPrimitiveRefinement",
	"grouped", "attributeInGroupCardinality", "attributeCardinality", "contentTypeId", "domainId", "ruleStrengthId",
	"attributeRule", "rangeConstraint"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalFieldsPojo {

	//Domain
	private String domainTemplateForPostcoordination;

	private String domainTemplateForPrecoordination;

	private String proximalPrimitiveConstraint;

	private String guideURL;

	private String domainConstraint;

	private String parentDomain;

	private String proximalPrimitiveRefinement;
	
	//Attribute domain
	private boolean grouped;
	
	private String attributeInGroupCardinality;
	
	private String attributeCardinality;
	
	private String contentTypeId;
	
	private String domainId;
	
	private String ruleStrengthId;
	
	//Attribute range
	private String attributeRule;
	
	private String rangeConstraint;
	

	public AdditionalFieldsPojo() {}

	public String getDomainTemplateForPostcoordination() {
		return domainTemplateForPostcoordination;
	}

	public void setDomainTemplateForPostcoordination(String domainTemplateForPostcoordination) {
		this.domainTemplateForPostcoordination = domainTemplateForPostcoordination;
	}

	public String getDomainTemplateForPrecoordination() {
		return domainTemplateForPrecoordination;
	}

	public void setDomainTemplateForPrecoordination(String domainTemplateForPrecoordination) {
		this.domainTemplateForPrecoordination = domainTemplateForPrecoordination;
	}

	public String getProximalPrimitiveConstraint() {
		return proximalPrimitiveConstraint;
	}

	public void setProximalPrimitiveConstraint(String proximalPrimitiveConstraint) {
		this.proximalPrimitiveConstraint = proximalPrimitiveConstraint;
	}

	public String getGuideURL() {
		return guideURL;
	}

	public void setGuideURL(String guideURL) {
		this.guideURL = guideURL;
	}

	public String getDomainConstraint() {
		return domainConstraint;
	}

	public void setDomainConstraint(String domainConstraint) {
		this.domainConstraint = domainConstraint;
	}

	public String getParentDomain() {
		return parentDomain;
	}

	public void setParentDomain(String parentDomain) {
		this.parentDomain = parentDomain;
	}

	public String getProximalPrimitiveRefinement() {
		return proximalPrimitiveRefinement;
	}

	public void setProximalPrimitiveRefinement(String proximalPrimitiveRefinement) {
		this.proximalPrimitiveRefinement = proximalPrimitiveRefinement;
	}
	
	public boolean isGrouped() {
		return grouped;
	}

	public void setGrouped(boolean grouped) {
		this.grouped = grouped;
	}

	public String getAttributeInGroupCardinality() {
		return attributeInGroupCardinality;
	}

	public void setAttributeInGroupCardinality(String attributeInGroupCardinality) {
		this.attributeInGroupCardinality = attributeInGroupCardinality;
	}

	public String getAttributeCardinality() {
		return attributeCardinality;
	}

	public void setAttributeCardinality(String attributeCardinality) {
		this.attributeCardinality = attributeCardinality;
	}

	public String getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(String contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getRuleStrengthId() {
		return ruleStrengthId;
	}

	public void setRuleStrengthId(String ruleStrengthId) {
		this.ruleStrengthId = ruleStrengthId;
	}

	public String getAttributeRule() {
		return attributeRule;
	}

	public void setAttributeRule(String attributeRule) {
		this.attributeRule = attributeRule;
	}

	public String getRangeConstraint() {
		return rangeConstraint;
	}

	public void setRangeConstraint(String rangeConstraint) {
		this.rangeConstraint = rangeConstraint;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalFieldsPojo [");
		if (domainTemplateForPostcoordination != null)
			builder.append("domainTemplateForPostcoordination=").append(domainTemplateForPostcoordination).append(", ");
		if (domainTemplateForPrecoordination != null)
			builder.append("domainTemplateForPrecoordination=").append(domainTemplateForPrecoordination).append(", ");
		if (proximalPrimitiveConstraint != null)
			builder.append("proximalPrimitiveConstraint=").append(proximalPrimitiveConstraint).append(", ");
		if (guideURL != null)
			builder.append("guideURL=").append(guideURL).append(", ");
		if (domainConstraint != null)
			builder.append("domainConstraint=").append(domainConstraint).append(", ");
		if (parentDomain != null)
			builder.append("parentDomain=").append(parentDomain).append(", ");
		if (proximalPrimitiveRefinement != null)
			builder.append("proximalPrimitiveRefinement=").append(proximalPrimitiveRefinement).append(", ");
		builder.append("grouped=").append(grouped).append(", ");
		if (attributeInGroupCardinality != null)
			builder.append("attributeInGroupCardinality=").append(attributeInGroupCardinality).append(", ");
		if (attributeCardinality != null)
			builder.append("attributeCardinality=").append(attributeCardinality).append(", ");
		if (contentTypeId != null)
			builder.append("contentTypeId=").append(contentTypeId).append(", ");
		if (domainId != null)
			builder.append("domainId=").append(domainId).append(", ");
		if (ruleStrengthId != null)
			builder.append("ruleStrengthId=").append(ruleStrengthId).append(", ");
		if (attributeRule != null)
			builder.append("attributeRule=").append(attributeRule).append(", ");
		if (rangeConstraint != null)
			builder.append("rangeConstraint=").append(rangeConstraint);
		builder.append("]");
		return builder.toString();
	}
}
