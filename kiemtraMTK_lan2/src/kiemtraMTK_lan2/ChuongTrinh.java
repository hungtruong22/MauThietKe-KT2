package kiemtraMTK_lan2;

import java.util.ArrayList;
import java.util.List;

public class ChuongTrinh {
	// Tìm kiếm các phần tử có chứa ký tự cho trước
		static void search(List<IFile> Ifiles, String keyword) {

		    // Khởi tạo biến đếm
		    int i = 1;

		    // Duyệt qua danh sách các phần tử
		    for (IFile Ifile : Ifiles) {
		    //	System.out.println(Ifile.getName()+" " +Ifile.getClass().getSimpleName());
		        // Kiểm tra xem tên của phần tử có chứa ký tự cho trước hay không
		        if (Ifile.getName().toLowerCase().contains(keyword.toLowerCase())) {

		            // Xác định loại của phần tử
		            String type = Ifile.getClass().getSimpleName();
		            //System.out.println(type);
		            if (Ifile instanceof File) {
		                type = "File";
		            } else {
		                type = "Folder";
		            }

		            // Tạo đường dẫn đầy đủ của phần tử
		            String path = "";
		            if (Ifile instanceof Folder) {
		                path = Ifile.getName();
		                	
		            } else {
		                path = Ifile.getName();
		            }

		            // In ra màn hình thông tin của phần tử
		            System.out.printf("%3d | %-20s | %-20s | %-10s | %-10.2f\n",
		                    i++, Ifile.getName(), path, type, Ifile.getSize());

		            // Tìm kiếm children của phần tử
		            if (Ifile instanceof Folder) {
		                search(Ifile.getFileCon(), keyword);
		            }
		        }
		    }
		}



		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Tạo danh sách các phần tử
			
			//Câu 2
			List<IFile> Ifiles = new ArrayList<IFile>();
			
			Folder developmentTools = new Folder("Development tools");
			Folder dbTools = new Folder("DB tools");
			dbTools.addFileCon(new File("MS SQL Server file", 500));
			dbTools.addFileCon(new File("PosgreSQL", 246));
			dbTools.addFileCon(new File("MySQL", 199));
			dbTools.addFileCon(new File("SQLite", 10));
			developmentTools.addFileCon(dbTools);
			// Thêm các instance vào danh sách
			Ifiles.add(developmentTools);
			

			// Tạo các instance khác
			File msdn = new File("MSDN", 15);
			Folder caseTools = new Folder("CASE tools");
			caseTools.addFileCon(new File("EA", 200));
			caseTools.addFileCon(new File("StarUML", 22));
			File dotNET = new File("dotNET", 199);
			
			Folder officeTools = new Folder("Office Tools");
			officeTools.addFileCon(new File("Libre office", 100));
			officeTools.addFileCon(new File("MS Office", 129));

			// Thêm các instance khác vào danh sách
			Ifiles.add(msdn);
			Ifiles.add(caseTools);
			Ifiles.add(dotNET);
			Ifiles.add(officeTools);
			
			//Câu 3:
			System.out.println("STT | FileName	|  ĐuongDan      |Loai     " + "   |  Size");

			search(Ifiles,"e");

		}
}
