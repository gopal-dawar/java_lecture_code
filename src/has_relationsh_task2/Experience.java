package has_relationsh_task2;

public class Experience {
	private String jobTitile;
	private String companyName;
	private String duration;

	public String getJobTitile() {
		return jobTitile;
	}

	public void setJobTitile(String jobTitile) {
		this.jobTitile = jobTitile;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "\nExperience Job Titile : " + jobTitile + "\nCompany Name : " + companyName + "\nDuration : " + duration;
	}

}
