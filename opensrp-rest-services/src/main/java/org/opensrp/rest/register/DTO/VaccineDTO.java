package org.opensrp.rest.register.DTO;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

public class VaccineDTO {
    @JsonProperty
    private List<VaccineEntryDTO> vaccineEntries;

    public VaccineDTO(List<VaccineEntryDTO> vaccineEntries) {
        this.vaccineEntries = vaccineEntries;
    }

    @Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, "id", "revision");
	}
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "revision");
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
