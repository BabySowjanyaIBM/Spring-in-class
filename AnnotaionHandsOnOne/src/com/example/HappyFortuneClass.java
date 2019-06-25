package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneClass implements Fortune {
	 String[] AllFortune;
	
	@PostConstruct
	public void setAllFortune() {
		String strCurrentLine;
		int index=0;
		AllFortune=new String[4];
		try {
			BufferedReader objreader=new BufferedReader(new FileReader("FortuneTextfile"));
			while ((strCurrentLine = objreader.readLine()) != null) {
				//System.out.println(strCurrentLine);
			    AllFortune[index++]=strCurrentLine;
			   }
			objreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}  
	@Override
	public String getFortune() {
		String toreturn=AllFortune[(int) (Math.random()*AllFortune.length)];
		return toreturn;
		//return "sdfs";
	}

}
