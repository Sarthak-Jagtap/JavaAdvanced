import java.io.*;


class CopyImage{

	public static void main(String[] args){

		String image = "image.png";
		String output = "output.png";

		try(
				FileInputStream fis = new FileInputStream(image);
				FileOutputStream fos = new FileOutputStream(output);
		   ){
			int bytes;

			while((bytes = fis.read()) != -1){

				fos.write(bytes);
			}
		   }
		catch(Exception e){

			e.printStackTrace();
		}
	}
}
