package kiemtraMTK_lan2;

import java.util.List;

public interface IFile {
	 public String getName();
	 public double getSize();
	 public void addFileCon(IFile child);
	 public List<IFile> getFileCon();

}
