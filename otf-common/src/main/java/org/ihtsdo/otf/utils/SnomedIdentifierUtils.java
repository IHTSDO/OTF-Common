package org.ihtsdo.otf.utils;

import com.google.common.base.Strings;

import java.util.regex.Pattern;

public class SnomedIdentifierUtils {

	public static final Pattern SCTID_PATTERN = Pattern.compile("\\d{6,18}");

	private static final String PARTITION_PART2_CONCEPT = "0";
	private static final String PARTITION_PART2_DESCRIPTION = "1";
	private static final String PARTITION_PART2_RELATIONSHIP = "2";

	public static boolean isValidConceptIdFormat(String sctid) {
		return sctid != null && SCTID_PATTERN.matcher(sctid).matches() && PARTITION_PART2_CONCEPT.equals(getPartitionIdPart(sctid)) && isChecksumCorrect(sctid);
	}

	public static boolean isValidDescriptionIdFormat(String sctid) {
		return sctid != null && SCTID_PATTERN.matcher(sctid).matches() && PARTITION_PART2_DESCRIPTION.equals(getPartitionIdPart(sctid)) && isChecksumCorrect(sctid);
	}

	public static boolean isValidRelationshipIdFormat(String sctid) {
		return sctid != null && SCTID_PATTERN.matcher(sctid).matches() && PARTITION_PART2_RELATIONSHIP.equals(getPartitionIdPart(sctid)) && isChecksumCorrect(sctid);
	}

	public static boolean isChecksumCorrect(String sctid) {
		return VerhoeffCheck.validateLastChecksumDigit(sctid);
	}

	private static String getPartitionIdPart(String sctid) {
		if (!Strings.isNullOrEmpty(sctid) && sctid.length() > 4) {
			return sctid.substring(sctid.length() - 2, sctid.length() - 1);
		}
		return null;
	}

}
