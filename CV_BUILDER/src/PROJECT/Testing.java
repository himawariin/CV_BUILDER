package P1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class Testing {
	public static void main(String[] args) throws IOException, ParseException {

		try {
			
			com.itextpdf.text.Font unu = FontFactory.getFont(FontFactory.TIMES_ROMAN, 27, Font.BOLD, BaseColor.BLACK);
			com.itextpdf.text.Font doi = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, BaseColor.BLACK);
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream(box10.nume_fisier1+".pdf"));
			writer.setFullCompression();
			writer.setInitialLeading(40.5f);
			document.open();
			float fntSize, lineSpacing;
			fntSize = 40f;
			lineSpacing = 33f;
			Paragraph p1 = new Paragraph(lineSpacing, box3.prenume1 + " " + box3.nume1, unu);
			document.add(p1);

			long years_difference = 0;
			String data = box3.zi + "-" + box3.luna + "-" + box3.an;
			SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyyy");
			try {
				java.util.Date date1 = obj.parse(data);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDateTime now = LocalDateTime.now();
				java.util.Date date2 = obj.parse(dtf.format(now));
				long time_difference = date2.getTime() - date1.getTime();
				years_difference = (time_difference / (1000l * 60 * 60 * 24 * 365));
			} catch (ParseException excep) {
				excep.printStackTrace();
			}
			 Paragraph p2 = new Paragraph(17, years_difference+" ani "+"("+box3.zi+"/"+box3.luna+"/"+box3.an+")"+ ", "+ box3.gen1,
	        		 FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK));
	         document.add(p2);
			Paragraph p2_1 = new Paragraph(7, " ", doi);
			Paragraph p2_2 = new Paragraph(17, " ", doi);
			Paragraph p2_3 = new Paragraph(10, " ", doi);
			document.add(p2_2);
	         BaseFont bfTimes = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1252, false);
	         Font times = new Font(bfTimes, 12, Font.NORMAL, BaseColor.BLACK);

	         if(box10.detalii_pers1.equals("dispuse pe o coloana"))
	         {Paragraph p3 = new Paragraph(15, "Tara:                             "+box3.tara1+"\nOras:                             "+box3.localitate1+"\nAdresa:                          "+box3.strada1+"\nTelefon:                         "+box3.nrtel1+"\nEmail:                            "+box3.email1+"\nCarnet auto:                   "+box3.carnet1,
	        		 FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, BaseColor.BLACK));
	         document.add(p3);}
	         else
	         {
	        	 PdfPTable table = new PdfPTable(4);
		         
		         table.setTotalWidth(new float[]{ 65,200, 120,135 });
		         table.setLockedWidth(true);
		         PdfPCell cell1=new PdfPCell(new Phrase("Tara: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase(box3.tara1, times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase("Oras: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase(box3.localitate1, times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase("Adresa: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		        cell1=new PdfPCell(new Phrase(box3.strada1, times));
		        cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase("Telefon: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase(box3.nrtel1, times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase("Email: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase(box3.email1, times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase("Carnet auto: ", times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);
		         
		         cell1=new PdfPCell(new Phrase(box3.carnet1, times));
		         cell1.setBorderColorBottom(BaseColor.WHITE);
		         cell1.setBorderWidthLeft(5);
		         cell1.setBorderColorLeft(BaseColor.WHITE);
		         cell1.setBorderWidthRight(5);
		         cell1.setBorderColorRight(BaseColor.WHITE);
		         cell1.setBorderWidthTop(8);
		         cell1.setBorderColorTop(BaseColor.WHITE);
		         table.addCell(cell1);

		         document.add(table);
	         }

			document.add(p2_2);

			///////////////////////////////////////////////////////////// SUMARUL
			if(box10.prez_sumar1.equals("da"))
			{Paragraph p0 = new Paragraph(20, "SUMAR",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK));
			document.add(p0);
			Paragraph p5 = new Paragraph(3,
					"________________________________________________________________________________________________________",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, BaseColor.BLACK));
			document.add(p5);
			document.add(p2_1);
			PdfPTable table1 = new PdfPTable(1);
			table1.setTotalWidth(new float[] { 400 });// ori 400 ori 500
			table1.setLockedWidth(true);
	         PdfPCell cell1 = new PdfPCell(new Phrase(box3.sumar1, times));
			cell1.setBorderColorBottom(BaseColor.WHITE);
			cell1.setBorderWidthLeft(5);
			cell1.setBorderColorLeft(BaseColor.WHITE);
			cell1.setBorderWidthRight(5);
			cell1.setBorderColorRight(BaseColor.WHITE);
			cell1.setBorderWidthTop(8);
			cell1.setBorderColorTop(BaseColor.WHITE);
			table1.addCell(cell1);
			document.add(table1);
			}
			/////////////////////////////////////////////////// STUDII
			document.add(p2_2);
			Paragraph p4 = new Paragraph(20, "STUDII",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK));
			document.add(p4);
			Paragraph p5 = new Paragraph(3,
					"________________________________________________________________________________________________________",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, BaseColor.BLACK));
			document.add(p5);
			document.add(p2_1);
			Paragraph p6 = new Paragraph(20, box3.educatie1,
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 17, Font.BOLD, BaseColor.BLACK));
			document.add(p6);
			document.add(p2_1);
			Paragraph p7 = new Paragraph(20,
					"Diploma (tipul studiilor):               " + box3.diploma1
							+ "\nSpecializare:                                   " + box3.specializare1
							+ "\nOras:                                               " + box3.localitate1,
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK));
			document.add(p7);

			/////////////////////////////////////////////////// ABILITATI
			document.add(p2_2);
			Paragraph p9 = new Paragraph(20, "ABILITATI",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK));
			document.add(p9);
			document.add(p5);
			document.add(p2_3);
			Paragraph p10 = new Paragraph(20,
					"Limba materna:                               " + box3.materna1
							+ "\nLimbi straine:                                  " + box3.limbi1
							+ "\nCompetente digitale:                       " + box3.digitale1
							+ "\nCarnet auto:                                     " + box3.carnet1,
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK));
			document.add(p10);
			document.add(p2_2);


			/////////////////////////////////////////////////// EXPERIENTA
			if(box10.prez_exp1.equals("da"))
			{BaseFont bfTimes1 = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1252, false);
			Font times1 = new Font(bfTimes1, 12, Font.NORMAL, BaseColor.BLACK);
			Paragraph p13 = new Paragraph(20, "EXPERIENTA",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK));
			document.add(p13);
			document.add(p5);
			document.add(p2_3);
			Paragraph p14 = new Paragraph(20,
					"Functie ocupata:                               " + box3.functie1
							+ "\nFirma angajatoare:                           " + box3.angajator1
							+ "\nLocalitate:                                        " + box3.localitate_job
							+ "\nTara:                                                 " + box3.tara_job,
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK));
			
			document.add(p14);
			document.add(p2_1);

			PdfPTable table2 = new PdfPTable(3);
			table2.setTotalWidth(new float[] { 135,40,355});// ori 400 ori 500
			table2.setLockedWidth(true);
			 PdfPCell cell1 = new PdfPCell(new Phrase("Sumar activitati / responsabilitati la joburi anterioare:", times1));
			cell1.setBorderColorBottom(BaseColor.WHITE);
			cell1.setBorderWidthLeft(5);
			cell1.setBorderColorLeft(BaseColor.WHITE);
			cell1.setBorderWidthRight(5);
			cell1.setBorderColorRight(BaseColor.WHITE);
			cell1.setBorderWidthTop(8);
			cell1.setBorderColorTop(BaseColor.WHITE);
			table2.addCell(cell1);
			cell1 = new PdfPCell(new Phrase("", times1));
			cell1.setBorderColorBottom(BaseColor.WHITE);
			cell1.setBorderWidthLeft(5);
			cell1.setBorderColorLeft(BaseColor.WHITE);
			cell1.setBorderWidthRight(5);
			cell1.setBorderColorRight(BaseColor.WHITE);
			cell1.setBorderWidthTop(8);
			cell1.setBorderColorTop(BaseColor.WHITE);
			table2.addCell(cell1);
			cell1 = new PdfPCell(new Phrase(box3.activitati1, times));
			cell1.setBorderColorBottom(BaseColor.WHITE);
			cell1.setBorderWidthLeft(5);
			cell1.setBorderColorLeft(BaseColor.WHITE);
			cell1.setBorderWidthRight(5);
			cell1.setBorderColorRight(BaseColor.WHITE);
			cell1.setBorderWidthTop(8);
			cell1.setBorderColorTop(BaseColor.WHITE);
			table2.addCell(cell1);
			document.add(table2);

			}
			document.add(p2_2);

			/////////////////////////////////////////TIP JOB DORIT
			Paragraph p11 = new Paragraph(20, "TIP JOB DORIT",
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK));
			document.add(p11);
			document.add(p5);
			document.add(p2_3);
			Paragraph p12 = new Paragraph(20,
					"Tip job:                                          " + box3.tip_job1
							+ "\nNivel job:                                      " + box3.nivel_job1
							+ "\nSalariu(EUR):                               " + box3.salariu1
							+ "\nSunt dispus sa calatoresc:             " + box3.calatorit1,
					FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, BaseColor.BLACK));
			document.add(p12);
			document.close();
			writer.close();
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}