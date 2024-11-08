package kiemtraMTK_lan2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
	private String name;
    private List<IFile> filecon;



	public Folder(String name) {
        this.name = name;
        this.filecon = new ArrayList<IFile>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        double size = 0;
        for (IFile x : filecon) {
            size += x.getSize();
        }
        return size;
    }

    @Override
    public void addFileCon(IFile x) {
        filecon.add(x);
    }

    @Override
    public List<IFile> getFileCon() {
        return filecon;
    }
}
