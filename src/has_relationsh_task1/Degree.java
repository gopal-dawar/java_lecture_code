package has_relationsh_task1;

public class Degree {

	private String degreeName;
	private String fieldofStudy;
	private String university;
	private String duration;

	@Override
	public String toString() {
		return "\nDegree Name : " + degreeName + "\nFieldofStudy : " + fieldofStudy + "\nUniversity=" + university
				+ "\nDuration=" + duration + "]";
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getFieldofStudy() {
		return fieldofStudy;
	}

	public void setFieldofStudy(String fieldofStudy) {
		this.fieldofStudy = fieldofStudy;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
