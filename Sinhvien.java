package module1;

public class Sinhvien {
	private int id;
    private String name;
    private float theoryMark;
    private float practiceMark;
	public Sinhvien(int id, String name, float theoryMark, float practiceMark) {
		super();
		this.id = id;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
	}
	public float calAverageMark() {
		return (theoryMark+practiceMark)/2;
	}
	
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ","
				+ " name=" + name + ","
				+ " theoryMark=" + theoryMark + ","
			    + "practiceMark=" + practiceMark
				+ "]";
	}

	
	public Sinhvien() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0)
			this.id=0;
		else
			this.id=id;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals(""))
		    this.name= "default";
		else
		    this.name = name;
	}
	public float getTheoryMark() {
		return theoryMark;
	}
	public void setTheoryMark(float theoryMark) {
		this.theoryMark = theoryMark;
	}
	public float getPracticeMark() {
		return practiceMark;
	}
	public void setPracticeMark(float practiceMark) {
		this.practiceMark = practiceMark;
	}
	}		

	
	