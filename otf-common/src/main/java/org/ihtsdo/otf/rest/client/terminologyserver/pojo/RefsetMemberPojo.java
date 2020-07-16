package org.ihtsdo.otf.rest.client.terminologyserver.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.ihtsdo.otf.utils.SnomedIdentifierUtils;

@JsonPropertyOrder({"id", "effectiveTime", "released", "releasedEffectiveTime", "active", "moduleId", "refsetId", "referencedComponentId", "additionalFields"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefsetMemberPojo implements SnomedComponent {

	private String id;

	private boolean released;

	private String effectiveTime;

	private boolean active;

	private String moduleId;

	private String releasedEffectiveTime;

	private String referencedComponentId;

	private String refsetId;

	private AdditionalFieldsPojo additionalFields;

	public RefsetMemberPojo() {}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getConceptId() {
		return SnomedIdentifierUtils.isValidConceptIdFormat(referencedComponentId) ? referencedComponentId : null;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setReleasedEffectiveTime(String releasedEffectiveTime) {
		this.releasedEffectiveTime = releasedEffectiveTime;
	}

	public String getreleasedEffectiveTime() {
		return releasedEffectiveTime;
	}

	public void setReferencedComponentId(String referencedComponentId) {
		this.referencedComponentId = referencedComponentId;
	}

	public String getRefsetId() {
		return refsetId;
	}

	public void setRefsetId(String refsetId) {
		this.refsetId = refsetId;
	}

	public AdditionalFieldsPojo getAdditionalFields() {
		return additionalFields;
	}

	public void setAdditionalFields(AdditionalFieldsPojo additionalFields) {
		this.additionalFields = additionalFields;
	}

	public String getReferencedComponentId() {
		return referencedComponentId;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public boolean getReleased() {
		return released;
	}

	public void setReleased(boolean released) {
		this.released = released;
	}

	@Override
	public String toString() {
		return "RefsetPojo [id=" + id + ", released=" + released + ", effectiveTime=" + effectiveTime + ", active=" + active
				+ ", moduleId=" + moduleId + ", releasedEffectiveTime=" + releasedEffectiveTime
				+ ", referencedComponentId=" + referencedComponentId + ", refsetId=" + refsetId + ", additionalFields="
				+ additionalFields + "]";
	}
	
}
