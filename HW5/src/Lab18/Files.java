package Lab18;

public class Files {

	int id;
	String name;
	int is_folder; 
	int parent_id;
	int owner_id;
	
	
	public Files(int id, String name, int is_folder, int parent_id, int owner_id) {
		super();
		this.id = id;
		this.name = name;
		this.is_folder = is_folder;
		this.parent_id = parent_id;
		this.owner_id = owner_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIs_folder() {
		return is_folder;
	}


	public void setIs_folder(int is_folder) {
		this.is_folder = is_folder;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	public int getOwner_id() {
		return owner_id;
	}


	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	
	
	
	
	
	
	
	
	
	
	
}
