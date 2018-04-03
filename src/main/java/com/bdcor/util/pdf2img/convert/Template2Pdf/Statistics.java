package com.bdcor.util.pdf2img.convert.Template2Pdf;

import java.util.Date;

public class Statistics {
	private Date scanStartDate;
	private Date scanEndDate;
	private Integer totalPersons;
	private Integer totalTubes;
	private String comparedRatio;
	private String exceptionMessages;
	private String minorityMessages;
	private Integer Matchingpersons;
	private Integer misMatchingpersons;
	private String matchingRatio;
	private String minorityExceptionMessages;
	private String purpleRatio;
	private String whiteRatio;
	private String grayRatio;
	private String yellowRatio;
	private String averRatio;
	private Date recycleSampleStartDate;
	private Date recycleSampleEndDate;
	private Integer recycleTotalPersons;
	private Integer recycletotalTubes;
	private Integer recycle3TotalPersons;
	private Integer recycle3totalTubes;
	private Integer recycle2TotalPersons;
	private Integer recycle2totalTubes;
	private Integer scanTotalPersons;
	private Integer scantotalTubes;
	private Integer scan3TotalPersons;
	private Integer scan3totalTubes;
	private Integer scan2TotalPersons;
	private Integer scan2totalTubes;
	public Statistics() {
		super();
	}
	public Statistics(Date scanStartDate, Date scanEndDate, Integer totalPersons, Integer totalTubes,
			String comparedRatio, String exceptionMessages, String minorityMessages, Integer matchingpersons,
			Integer misMatchingpersons, String matchingRatio, String minorityExceptionMessages, String purpleRatio,
			String whiteRatio, String grayRatio, String yellowRatio, String averRatio, Date recycleSampleStartDate,
			Date recycleSampleEndDate, Integer recycleTotalPersons, Integer recycletotalTubes,
			Integer recycle3TotalPersons, Integer recycle3totalTubes, Integer recycle2TotalPersons,
			Integer recycle2totalTubes, Integer scanTotalPersons, Integer scantotalTubes, Integer scan3TotalPersons,
			Integer scan3totalTubes, Integer scan2TotalPersons, Integer scan2totalTubes) {
		super();
		this.scanStartDate = scanStartDate;
		this.scanEndDate = scanEndDate;
		this.totalPersons = totalPersons;
		this.totalTubes = totalTubes;
		this.comparedRatio = comparedRatio;
		this.exceptionMessages = exceptionMessages;
		this.minorityMessages = minorityMessages;
		Matchingpersons = matchingpersons;
		this.misMatchingpersons = misMatchingpersons;
		this.matchingRatio = matchingRatio;
		this.minorityExceptionMessages = minorityExceptionMessages;
		this.purpleRatio = purpleRatio;
		this.whiteRatio = whiteRatio;
		this.grayRatio = grayRatio;
		this.yellowRatio = yellowRatio;
		this.averRatio = averRatio;
		this.recycleSampleStartDate = recycleSampleStartDate;
		this.recycleSampleEndDate = recycleSampleEndDate;
		this.recycleTotalPersons = recycleTotalPersons;
		this.recycletotalTubes = recycletotalTubes;
		this.recycle3TotalPersons = recycle3TotalPersons;
		this.recycle3totalTubes = recycle3totalTubes;
		this.recycle2TotalPersons = recycle2TotalPersons;
		this.recycle2totalTubes = recycle2totalTubes;
		this.scanTotalPersons = scanTotalPersons;
		this.scantotalTubes = scantotalTubes;
		this.scan3TotalPersons = scan3TotalPersons;
		this.scan3totalTubes = scan3totalTubes;
		this.scan2TotalPersons = scan2TotalPersons;
		this.scan2totalTubes = scan2totalTubes;
	}
	@Override
	public String toString() {
		return "Statistics [scanStartDate=" + scanStartDate + ", scanEndDate=" + scanEndDate + ", totalPersons="
				+ totalPersons + ", totalTubes=" + totalTubes + ", comparedRatio=" + comparedRatio
				+ ", exceptionMessages=" + exceptionMessages + ", minorityMessages=" + minorityMessages
				+ ", Matchingpersons=" + Matchingpersons + ", misMatchingpersons=" + misMatchingpersons
				+ ", matchingRatio=" + matchingRatio + ", minorityExceptionMessages=" + minorityExceptionMessages
				+ ", purpleRatio=" + purpleRatio + ", whiteRatio=" + whiteRatio + ", grayRatio=" + grayRatio
				+ ", yellowRatio=" + yellowRatio + ", averRatio=" + averRatio + ", recycleSampleStartDate="
				+ recycleSampleStartDate + ", recycleSampleEndDate=" + recycleSampleEndDate + ", recycleTotalPersons="
				+ recycleTotalPersons + ", recycletotalTubes=" + recycletotalTubes + ", recycle3TotalPersons="
				+ recycle3TotalPersons + ", recycle3totalTubes=" + recycle3totalTubes + ", recycle2TotalPersons="
				+ recycle2TotalPersons + ", recycle2totalTubes=" + recycle2totalTubes + ", scanTotalPersons="
				+ scanTotalPersons + ", scantotalTubes=" + scantotalTubes + ", scan3TotalPersons=" + scan3TotalPersons
				+ ", scan3totalTubes=" + scan3totalTubes + ", scan2TotalPersons=" + scan2TotalPersons
				+ ", scan2totalTubes=" + scan2totalTubes + "]";
	}
	public Date getScanStartDate() {
		return scanStartDate;
	}
	public void setScanStartDate(Date scanStartDate) {
		this.scanStartDate = scanStartDate;
	}
	public Date getScanEndDate() {
		return scanEndDate;
	}
	public void setScanEndDate(Date scanEndDate) {
		this.scanEndDate = scanEndDate;
	}
	public Integer getTotalPersons() {
		return totalPersons;
	}
	public void setTotalPersons(Integer totalPersons) {
		this.totalPersons = totalPersons;
	}
	public Integer getTotalTubes() {
		return totalTubes;
	}
	public void setTotalTubes(Integer totalTubes) {
		this.totalTubes = totalTubes;
	}
	public String getComparedRatio() {
		return comparedRatio;
	}
	public void setComparedRatio(String comparedRatio) {
		this.comparedRatio = comparedRatio;
	}
	public String getExceptionMessages() {
		return exceptionMessages;
	}
	public void setExceptionMessages(String exceptionMessages) {
		this.exceptionMessages = exceptionMessages;
	}
	public String getMinorityMessages() {
		return minorityMessages;
	}
	public void setMinorityMessages(String minorityMessages) {
		this.minorityMessages = minorityMessages;
	}
	public Integer getMatchingpersons() {
		return Matchingpersons;
	}
	public void setMatchingpersons(Integer matchingpersons) {
		Matchingpersons = matchingpersons;
	}
	public Integer getMisMatchingpersons() {
		return misMatchingpersons;
	}
	public void setMisMatchingpersons(Integer misMatchingpersons) {
		this.misMatchingpersons = misMatchingpersons;
	}
	public String getMatchingRatio() {
		return matchingRatio;
	}
	public void setMatchingRatio(String matchingRatio) {
		this.matchingRatio = matchingRatio;
	}
	public String getMinorityExceptionMessages() {
		return minorityExceptionMessages;
	}
	public void setMinorityExceptionMessages(String minorityExceptionMessages) {
		this.minorityExceptionMessages = minorityExceptionMessages;
	}
	public String getPurpleRatio() {
		return purpleRatio;
	}
	public void setPurpleRatio(String purpleRatio) {
		this.purpleRatio = purpleRatio;
	}
	public String getWhiteRatio() {
		return whiteRatio;
	}
	public void setWhiteRatio(String whiteRatio) {
		this.whiteRatio = whiteRatio;
	}
	public String getGrayRatio() {
		return grayRatio;
	}
	public void setGrayRatio(String grayRatio) {
		this.grayRatio = grayRatio;
	}
	public String getYellowRatio() {
		return yellowRatio;
	}
	public void setYellowRatio(String yellowRatio) {
		this.yellowRatio = yellowRatio;
	}
	public String getAverRatio() {
		return averRatio;
	}
	public void setAverRatio(String averRatio) {
		this.averRatio = averRatio;
	}
	public Date getRecycleSampleStartDate() {
		return recycleSampleStartDate;
	}
	public void setRecycleSampleStartDate(Date recycleSampleStartDate) {
		this.recycleSampleStartDate = recycleSampleStartDate;
	}
	public Date getRecycleSampleEndDate() {
		return recycleSampleEndDate;
	}
	public void setRecycleSampleEndDate(Date recycleSampleEndDate) {
		this.recycleSampleEndDate = recycleSampleEndDate;
	}
	public Integer getRecycleTotalPersons() {
		return recycleTotalPersons;
	}
	public void setRecycleTotalPersons(Integer recycleTotalPersons) {
		this.recycleTotalPersons = recycleTotalPersons;
	}
	public Integer getRecycletotalTubes() {
		return recycletotalTubes;
	}
	public void setRecycletotalTubes(Integer recycletotalTubes) {
		this.recycletotalTubes = recycletotalTubes;
	}
	public Integer getRecycle3TotalPersons() {
		return recycle3TotalPersons;
	}
	public void setRecycle3TotalPersons(Integer recycle3TotalPersons) {
		this.recycle3TotalPersons = recycle3TotalPersons;
	}
	public Integer getRecycle3totalTubes() {
		return recycle3totalTubes;
	}
	public void setRecycle3totalTubes(Integer recycle3totalTubes) {
		this.recycle3totalTubes = recycle3totalTubes;
	}
	public Integer getRecycle2TotalPersons() {
		return recycle2TotalPersons;
	}
	public void setRecycle2TotalPersons(Integer recycle2TotalPersons) {
		this.recycle2TotalPersons = recycle2TotalPersons;
	}
	public Integer getRecycle2totalTubes() {
		return recycle2totalTubes;
	}
	public void setRecycle2totalTubes(Integer recycle2totalTubes) {
		this.recycle2totalTubes = recycle2totalTubes;
	}
	public Integer getScanTotalPersons() {
		return scanTotalPersons;
	}
	public void setScanTotalPersons(Integer scanTotalPersons) {
		this.scanTotalPersons = scanTotalPersons;
	}
	public Integer getScantotalTubes() {
		return scantotalTubes;
	}
	public void setScantotalTubes(Integer scantotalTubes) {
		this.scantotalTubes = scantotalTubes;
	}
	public Integer getScan3TotalPersons() {
		return scan3TotalPersons;
	}
	public void setScan3TotalPersons(Integer scan3TotalPersons) {
		this.scan3TotalPersons = scan3TotalPersons;
	}
	public Integer getScan3totalTubes() {
		return scan3totalTubes;
	}
	public void setScan3totalTubes(Integer scan3totalTubes) {
		this.scan3totalTubes = scan3totalTubes;
	}
	public Integer getScan2TotalPersons() {
		return scan2TotalPersons;
	}
	public void setScan2TotalPersons(Integer scan2TotalPersons) {
		this.scan2TotalPersons = scan2TotalPersons;
	}
	public Integer getScan2totalTubes() {
		return scan2totalTubes;
	}
	public void setScan2totalTubes(Integer scan2totalTubes) {
		this.scan2totalTubes = scan2totalTubes;
	}

}
