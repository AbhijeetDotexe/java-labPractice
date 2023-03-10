import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterExample {

	public static void main(String[] args) {
		String dir = "C:\\Java\\class programs\\UNIT IV";
		String extension = ".doc";
		findFiles(dir, extension);
	}

	private static void findFiles(String dir, String extension) {
		File file = new File(dir);
		if (!file.exists())
			System.out.println(dir + " Directory doesn't exists");
		File[] listFiles = file.listFiles(new MyFileNameFilter(extension));
		// File[] listFiles = file.listFiles((d, s) -> {
		// return s.toLowerCase().endsWith(extension);
		// });

		if (listFiles.length == 0) {
			System.out.println(dir + "doesn't have any file with extension " + extension);
		} else {
			for (File f: listFiles)
				System.out.println("File: " + dir + File.separator + f.getName());
		}
	}

	// FileNameFilter implementation
	public static class MyFileNameFilter implements FilenameFilter {

		private String extension;

		public MyFileNameFilter(String extension) {
			this.extension = extension.toLowerCase();
		}

		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(extension);
		}

	}

}