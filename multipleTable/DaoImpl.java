package com.Multiple_Table.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Multiple_Table.dao.Dao;
import com.Multiple_Table.entity.FourWheeler1;
import com.Multiple_Table.entity.TwoWheeler1;
import com.Multiple_Table.util.Util;



public class DaoImpl implements Dao {
	public void addVehicle() {
		Session session=Util.activeSession();
		Transaction t=session.beginTransaction();
		TwoWheeler1 tw = new TwoWheeler1();
		tw.setFuel("petrol");
		tw.setEnginepower("500cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("sports bike");
		
		FourWheeler1 fw = new FourWheeler1();
		fw.setFuel("electric");
		fw.setEnginepower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("Car");
		fw.setPrice(800000);
		fw.setModelno(12345);
		fw.setModelname("swift");
		fw.setMusicsystem(true);
		fw.setEtype("auto");
		fw.setAc(true);
		
		session.save(tw);
		session.save(fw);
		
		t.commit();
		System.out.println("joining done");
	}
	
		
	}
