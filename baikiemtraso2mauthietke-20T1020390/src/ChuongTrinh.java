import java.util.ArrayList;
import java.util.Arrays;


public class ChuongTrinh {
	public static void main(String[] args) {
		
		IFile MS_SQL_SEVER_FILE = new File("MS_SQL_SEVER_FILE",500);
		 IFile PorgreSQL = new File("PorgreSQL", 246);
		 IFile MySQL = new File("MySQL",199);
		 IFile SQLite = new File("SQLite",10);
		 IFile MSDN = new File("MSDN",15);
		 IFile EA = new File("EA",200);
		 IFile StarUML = new File("StarUML",22);
		 IFile dotNET = new File("dotNET",199);
		 IFile Eclipse = new File("Eclipse",15);
		 IFile Libre_Office = new File("Libre_Office",100);
		 IFile Ms_Office = new File("Ms_Office", 129);
		 
		 IFile DB_tools = new Folder("DB_tools",Arrays.asList(MS_SQL_SEVER_FILE,PorgreSQL,MySQL,SQLite));
		 System.out.println("Dung luong cua DB tools la: " + DB_tools.getTotalSize());
		 IFile CASE_tools = new Folder("CASE_tools",Arrays.asList(EA,StarUML));
		 System.out.println("Dung luong cua CASE tools la: " + CASE_tools.getTotalSize());
		 IFile Development_tools = new Folder("Development_tools",Arrays.asList(DB_tools,MSDN,CASE_tools,dotNET,Eclipse));
		 
		 IFile Office_tools = new Folder("Office tools",Arrays.asList(Libre_Office,Ms_Office));
		 
		 IFile Development = new Folder("Office tools",Arrays.asList(Development_tools));
		 System.out.println("Dung luong cua Development tools la: " + Development.getTotalSize());
		 
		 IFile Office = new Folder("Office tools",Arrays.asList(Office_tools));
		 System.out.println("Dung luong cua Office tools la: " + Office.getTotalSize());
		 
		 
		 ArrayList<IFile> allFiles = new ArrayList<IFile>(Arrays.asList(Development, Office));

	        String searchString = "SQL"; // Thay đổi chuỗi tìm kiếm ở đây
	        System.out.printf("%-10s%-20s%-30s%-15s%-10s\n", "STT", "Tên phần tử", "Đường dẫn đầy đủ", "Loại", "Dung lượng");
	        int[] stt = {1};
	        for (IFile file : allFiles) {
	            file.xuatKQTK("", searchString, stt);
	        }
	}
}
