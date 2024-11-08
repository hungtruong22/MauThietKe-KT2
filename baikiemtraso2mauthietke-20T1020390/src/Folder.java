import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder implements IFile{

	private String name;
	private List<IFile> files;
	private Folder filecha;
	
	
	public Folder(String name, List<IFile> files) {
		this.name = name;
		this.files = files;
	}
	
	public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<IFile>();
    }
	
	public Folder getFileCha() {
		return filecha;
	}
	public void setFileCha(Folder filecha) {
		this.filecha = filecha;
	}
	
	public List<IFile> getFileCon() {
        return files;
    }
	
	public void addFile(File file) {
        file.setFileCha(this);
    	files.add(file);
    }
    public void addFolder(Folder folder) {
        folder.setFileCha(this); 
        files.add(folder);
    }

	@Override
	public String getFileName() {
		return name;
	}

	@Override
	public long getSize() {
		long dungluong = 0;
		for (IFile x : files) {
			dungluong += x.getSize();
        }	
		return dungluong;
	}
	
	
	@Override
	public long getTotalSize() {
		if(this.files == null) {
			return 0;
		}
		
		long kq = 0;
		for(IFile x : this.files) {
			kq += x.getTotalSize();
		}
		return kq;
	}
	@Override
	public String getPath() {
		if (filecha != null) {
            return filecha.getPath() + "/" + name;
        }
      return name;
	}

	@Override
	public String getLoai() {
		return "Folder";
	}
	
	@Override
    public void xuatKQTK(String prefix, String searchString, int[] stt) {
        if (name.contains(searchString)) {
            System.out.printf("%-10d%-20s%-30s%-15s%-10.2f\n", stt[0]++, name, prefix + name, "Tài liệu", getSize());
        }
    }
}
