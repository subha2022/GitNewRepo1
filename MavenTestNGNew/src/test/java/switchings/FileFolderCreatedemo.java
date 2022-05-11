package switchings;

import java.io.File;

public class FileFolderCreatedemo 
{

	public static void main(String[] args) 
	{
		String path= "C:\\Users\\pabitra\\Desktop\\Abc\\XYZ\\PQR"; 
		File f = new File(path);
		f.mkdirs();
		System.out.println("Floder is created completely");
		

	}

}
