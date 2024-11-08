package kiemtraMTK_lan2;

import java.util.List;

public class File implements IFile{
	private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void addFileCon(IFile child) {
        throw new UnsupportedOperationException("Khong the them phan tu con.");
    }

    @Override
    public List<IFile> getFileCon() {
        throw new UnsupportedOperationException("Khong co phan tu con.");
    }
}
