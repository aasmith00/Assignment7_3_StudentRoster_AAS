class Student {
	private String first;
	private String last;
	private String homeAd;
	private String currentAd;
	private String phone;
	private double gpa;
	
	public Student(String first, String last, String homeAd, String currentAd, String phone, double gpa) {
		this.first = first;
		this.last = last;
		this.homeAd = homeAd;
		this.currentAd = currentAd;
		this.phone = phone;
		this.gpa = gpa;	
	}
	
	
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public String getHomeAd() {
		return homeAd;
	}
	public String getCurrentAd() {
		return currentAd;
	}
	public String getPhone() {
		return phone;
	}
	public double getGpa() {
		return gpa;
	}
	
	
	public void setFirst(String newFirst) {
		first = newFirst;
	}
	public void setLast(String newLast) {
		last = newLast;
	}
	public void setHomeAd(String newHomeAd) {
		homeAd = newHomeAd;
	}
	public void setCurrentAd(String newCurrentAd) {
		currentAd = newCurrentAd;
	}
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	public void setGpa (double newGpa) {
		gpa = newGpa;
	}
	
	public String toString() {
		return "Name: " + first + " " + last + "\n" + "Current Address: " + currentAd + "\n" + "Home Address: " + homeAd + "\n" + "Phone Number: " + phone + "\n" + "GPA: " + gpa + "\n";
	}
	
}