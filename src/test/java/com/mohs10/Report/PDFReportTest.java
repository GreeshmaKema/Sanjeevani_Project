package com.mohs10.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

public class PDFReportTest {
  @Test
  public void pdf() throws MalformedURLException, FileNotFoundException
  {
	  // Creating a PdfWriter       
      String dest = "Report/ClientReport.pdf";       
      PdfWriter writer = new PdfWriter(dest);        
      
      // Creating a PdfDocument       
      PdfDocument pdf = new PdfDocument(writer);              
      
      // Creating a Document        
      Document document = new Document(pdf); 
      
      //Creating table for report format
      float [] pointColumnWidths = {200f, 200f};
      Table table = new Table(pointColumnWidths);
    
      //file path of screenshot
      File file=new File("C:/Users/Tharun/eclipse-workspace/E_wrkspc2/Sai_Sanjivani_Project/TestcaseScreenshots/");
      
      //storing the list in string array
       String[] ls=file.list();
       
      /// Table table1 = new Table(pointColumnWidths);
       
       //report heading
       Text text2 = new Text(""+"Automation Test Report");  
    	      
    	 //Setting color to the text-customizing the text
            text2.setBold();
             text2.setFontSize(15);
    	      text2.setFontColor(Color.BLACK);
    	      
    	      text2.setUnderline();
    	      
    	     text2.setTextAlignment(TextAlignment.RIGHT);

    	      //Creating a paragraph 2 
    	      Paragraph para2 = new Paragraph(text2); 

    	      //Adding paragraphs to the document 
    	    //  doc.add(para1); 
    	    document.add(para2);
  
    	    //adding cells to table
    	    Cell cell1 = new Cell();
  	      cell1.add("Project Name");
  	     table.addCell(cell1);
         
   	  
	    Cell cell2 = new Cell();
	      cell2.add("Sai Sanjeevani Project");
	     table.addCell(cell2);
	      
	    Cell cell3 = new Cell();
	      cell3.add("Date");
	      table.addCell(cell3);
	      
	      Cell cell4 = new Cell();
      cell4.add("18/11/2022");
      table.addCell(cell4);
	      
      Cell cell5 = new Cell();
      cell5.add("Tester Name");
      table.addCell(cell5);
      
      Cell cell6 = new Cell();
      cell6.add("Greeshma");
      table.addCell(cell6);
   	  
     Cell cell7 = new Cell();       
     
     //this code is for making space in tables
     cell7.add("                                    "
     		+ "");
     
      
     cell7.setBorder(Border.NO_BORDER);
     
   //  cell7.getRowspan();
      table.addCell(cell7);
      
      Cell cell8 = new Cell();       
     cell8.add("                                    "
		+ "");       
     cell8.setBackgroundColor(Color.WHITE);       
      cell8.setBorder(Border.NO_BORDER);
      table.addCell(cell8);
      
      Cell cell9 = new Cell();       
     /* cell9.add("                                    "
    	  		+ "");         
	     cell9.setBackgroundColor(Color.WHITE);       
	      cell9.setBorder(Border.NO_BORDER);
	      table.addCell(cell9);*/
	      
	      cell9.setPaddingTop(20);
          cell9.setPaddingRight(20);
          cell9.setPaddingBottom(20);
          cell9.setPaddingLeft(20);
          cell9.setBorder(Border.NO_BORDER);
          table.addCell(cell9);
	      
	    Cell cell10 = new Cell();       
	    /*  cell10.add("                                    "
	    	  		+ "");         
		     cell10.setBackgroundColor(Color.WHITE);       
		      cell10.setBorder(Border.NO_BORDER);
		      table.addCell(cell10);*/
	      
		     
                
                cell10.setBorder(Border.NO_BORDER);
                table.addCell(cell10);
  		  
       //loop for adding images to the PDf
       for(int i=0;i<ls.length;i++) {
    	   
        String imFile = "C:/Users/Tharun/eclipse-workspace/E_wrkspc2/Sai_Sanjivani_Project/TestcaseScreenshots/"+ls[i];  
        
        //Testcase step name
        String stepname=ls[i];
        
       // System.out.println(stepname);
        
        //System.out.println("abhishek");
        
        //Spliting the capturedimage file names
        String[] stepname1=stepname.split("\\.");
        
        System.out.println(stepname1[0]);
        
        String stepname2 = stepname1[0];
       
        //hard coded the test data
    	   System.out.println(imFile);
    	   Cell cell11 = new Cell();
   	    cell11.add("Test case name");
   	      table.addCell(cell11);
          
    	
   	   //dynamicly added test data
 	     Cell cell12 = new Cell();
 	      cell12.add(stepname2);
 	     table.addCell(cell12);
 	      
 	    Cell cell13 = new Cell();
	      cell13.add("Details information");
	      table.addCell(cell13);
 	      
	      //empty cell where we will add the images
 	     Cell cell14 = new Cell();
    	   
    
    	  // here we create the image object
 	      ImageData data = ImageDataFactory.create(imFile);  
 	      Image image = new Image(data);
 	     
 	   // document.add(image); // added the image to document
 	    
 	//    image.scaleToFit(200, i);
 	   cell14.add(image.scaleToFit(300, 300)); 
 	  
       // Adding the image to cell14     
      table.addCell(cell14);                         
       
       // Adding Table to document        
     
      Cell cell15 = new Cell();       
	     /* cell9.add("                                    "
	    	  		+ "");         
		     cell9.setBackgroundColor(Color.WHITE);       
		      cell9.setBorder(Border.NO_BORDER);
		      table.addCell(cell9);*/
		      
		      cell15.setPaddingTop(25);
		     cell15.setPaddingRight(25);
		    cell15.setPaddingBottom(25);
		   cell15.setPaddingLeft(25);
		  cell15.setBorder(Border.NO_BORDER);
		 table.addCell(cell15);
		 
		Cell cell16 = new Cell();       
     /* cell9.add("                                    "
    	  		+ "");         
	     cell9.setBackgroundColor(Color.WHITE);       
	      cell9.setBorder(Border.NO_BORDER);
	      table.addCell(cell9);*/
	      
	      cell16.setPaddingTop(25);
	     cell16.setPaddingRight(25);
	    cell16.setPaddingBottom(25);
	   cell16.setPaddingLeft(25);
	  cell16.setBorder(Border.NO_BORDER);
	 table.addCell(cell16);
    	   
       }
       
       
       document.add(table);
      
      
      // Creating an ImageData object       
    //  String imFile = "F:/SeleniumTraining_secomd/image/pic1.png";       
     // ImageData data = ImageDataFactory.create(imFile);  
      
      System.out.println("Transaction name"); 
      
    
      
     // String imFile1 = "F:/SeleniumTraining_secomd/image/pic2.jpg";       
      //ImageData data1 = ImageDataFactory.create(imFile1);  
      
      // Creating an Image object        
       
      
    // Image image1 = new Image(data1);   
      
      // Adding image to the document       
     // document.add(image); 
      
    // document.add(image1); 
      
      // Closing the document 
      
     	
	     
      document.close();              
      
      System.out.println("Image added");    
   } 

  }

