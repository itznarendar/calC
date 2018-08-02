/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.xml.transform.stream.StreamResult;
import org.springframework.xml.transform.StringResult;


public class JavaApplication {

    
    public Integer add(Integer a,Integer b)
    {
        return a+b;
    }
     public void saveObjectAsXml(String fileSystem, Object o, String filename, String... subFolders) throws ElokFileNotStoredException {
    	System.out.println("1111111111111111111111111111");
    	
    	String foldersPath = "";
    	for(String folder : subFolders){
    		if(foldersPath.isEmpty()){
    			foldersPath = folder + "/";
    		}else{
    			foldersPath = foldersPath+folder+"/";
    		}
    	}
    	File file = new File(fileSystem, foldersPath); 
    	file.mkdirs();
    	System.out.println("222222222222");
    	 File f = new File(file.getAbsolutePath(), filename);
        OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PrintWriter out = null;
        StringResult res = new StringResult();
        

        try {
        	System.out.println("33333333333333");
        	StreamResult StreamResult=  	new StreamResult(new FileOutputStream(filename));
        	System.out.println("333333333333331");
            marshaller.marshal(o,StreamResult );
            System.out.println("333333333333331");
           /* out = new PrintWriter(f);
        //    out = new PrintWriter(new OutputStreamWriter(outputStream,"UTF-8"));
            out.write(res.toString());*/
            System.out.println("444444444444444");
        } catch (IOException ex) {
        	System.out.println("444444444444444");
        	ex.printStackTrace();
        	System.out.println("444444444444444");
        } finally {
            if(out != null){out.close();}
        }
        
     }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("   Addd    2222                         ");
    }
    
}
