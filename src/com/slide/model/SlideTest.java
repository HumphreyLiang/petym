package com.slide.model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class SlideTest {

	public static void main(String[] args) throws IOException {
		SlideJDBCDAO dao = new SlideJDBCDAO();

//		 �憓�
//		Slide slide1 = new Slide();
//		byte[] slideImg1 = getPictureByteArray("C:\\BA102_WebApp\\eclipse_WTP_WorkSpace\\ModelVer1\\WebContent\\DummyImg\\ad\\t1.jpg");
//		slide1.setSlideImg(slideImg1);
//		slide1.setSlideCategory("����");
//		slide1.setSlideTitle("����");
//		dao.insert(slide1);
//		System.out.println("�憓�");

//		 靽格
//		Slide slide2 = new Slide();
//		byte[] slideImg = getPictureByteArray("C:\\BA102_WebApp\\eclipse_WTP_WorkSpace\\ModelVer1\\WebContent\\DummyImg\\ad\\t1.jpg");
//		slide2.setSlideImg(slideImg);
//		slide2.setSlideCategory("��蔣����");
//		slide2.setSlideTitle("��蔣����");
//		slide2.setSlideNo(1);
//		dao.update(slide2);
//		System.out.println("靽格摰");

//		 ��
//		dao.delete(3);
//		System.out.println("���,蝟��");

//		 �閰�
//		Slide slide3 = dao.findByPrimaryKey(4);
//		System.out.println(slide3.getSlideNo());
//		System.out.println(slide3.getSlideImg());
//		System.out.println(slide3.getSlideCategory());
//		System.out.println(slide3.getSlideTitle());
//		System.out.println("�摰");

//		 ���
//		 List<Slide> slideList=dao.getAll();
//		 for(Slide slide : slideList){
//		 System.out.println(slide.getSlideNo());
//		 System.out.println(slide.getSlideImg());
//		 System.out.println(slide.getSlideCategory());
//		 System.out.println(slide.getSlideTitle());
//		 System.out.println("===================");
//		 }

	}
	
	// 雿輻byte[]�撘�
		public static byte[] getPictureByteArray(String path) throws IOException {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[8192];
			int i;
			while ((i = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, i);
			}
			baos.close();
			fis.close();

			return baos.toByteArray();
		}

}