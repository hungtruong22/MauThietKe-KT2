import java.util.ArrayList;
import java.util.Arrays;

public class File implements IFile{
	private String name;
	private long size;
    private Folder filecha = null;
	private ArrayList<String> dsName;
 

	@Override
	public long getTotalSize() {
		return this.size;
	}
	
	public File(String name, long size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getFileName() {
		return this.name;
	}
	
	@Override
	public String getPath() {
		  if (filecha != null) {
	            return filecha.getPath() + "/" + name;
	        }
	      return name;
	}
	
	public Folder getFileCha() {
		return filecha;
	}
	
	public void setFileCha(Folder filecha) {
		this.filecha = filecha;
	}
	
	@Override
	public String getLoai() {
		return "File";
	}
	
	@Override
	public long getSize() {
		return size;
	}
	
	@Override
    public void xuatKQTK(String prefix, String searchString, int[] stt) {
        if (name.contains(searchString)) {
            System.out.printf("%-10d%-20s%-30s%-15s%-10.2f\n", stt[0]++, name, prefix + name, "Tài liệu", size);
        }
    }
	
}
