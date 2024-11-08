import java.util.ArrayList;

public interface IFile {
	long getTotalSize();
	String getFileName();
	String getPath();
	long getSize();
	String getLoai();
	void xuatKQTK(String prefix, String searchString,int[] stt);
}
