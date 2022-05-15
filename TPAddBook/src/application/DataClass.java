package application;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
	private List<Person> importList;
	private List<Person> exportList;
	
	public DataClass() {
		importList = new ArrayList<Person>();
		importList.add(new Person("Sami","Ben Ali","sami@exemple.com"));
		importList.add(new Person("Alia","Ben Salah","alia@exemple.com"));
		importList.add(new Person("Ali","Ben Salah","ali@exemple.com"));
		exportList = new ArrayList<Person>();
	}
	
	public List<Person> getImportList() {
		return importList;
	}
	
	public List<Person> getExportList() {
		return exportList;
	}
	
	public void setExportList(List<Person> exportList) {
		this.exportList.addAll(exportList);
		for(Person p :this.exportList)
			System.out.println(p);
	}
}
