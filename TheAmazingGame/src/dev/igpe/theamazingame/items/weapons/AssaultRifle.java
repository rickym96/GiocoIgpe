package dev.igpe.theamazingame.items.weapons;

import java.awt.image.BufferedImage;

import dev.igpe.theamazingame.audio.AudioPlayer;
import dev.igpe.theamazingame.items.ItemList;

public class AssaultRifle extends Weapon{

	private static int DEFAULTDAMAGE = 20;
    private static long DEFAULTFIRERATE = 100;
    private int DEFAULTCALIBRO = 1;
    private int id = ItemList.gunItem.getId();
    private static int DEFAULTFIRERANGE = 400;
    private static AudioPlayer DEFAULTSHOOTSOUND;

	public AssaultRifle(BufferedImage texture, String name, int id, int DEFAULTFIRERANGE) {
		super(texture, name, id, DEFAULTDAMAGE, DEFAULTFIRERATE, DEFAULTFIRERANGE,DEFAULTSHOOTSOUND);
		this.calibro=DEFAULTCALIBRO;
	    this.damage =DEFAULTDAMAGE;
	    this.fireRate = DEFAULTFIRERATE;
	    this.id= id;
	    this.fireRange = DEFAULTFIRERANGE;
	    this.shootSound = new AudioPlayer("/sounds/9m.wav");
	}

	public static int getDEFAULTDAMAGE() {
		return DEFAULTDAMAGE;
	}

	public void setDEFAULTDAMAGE(int dEFAULTDAMAGE) {
		DEFAULTDAMAGE = dEFAULTDAMAGE;
	}

	public static long getDEFAULTFIRERATE() {
		return DEFAULTFIRERATE;
	}

	public static void setDEFAULTFIRERATE(long dEFAULTFIRERATE) {
		DEFAULTFIRERATE = dEFAULTFIRERATE;
	}

	public int getDEFAULTCALIBRO() {
		return DEFAULTCALIBRO;
	}

	public void setDEFAULTCALIBRO(int dEFAULTCALIBRO) {
		DEFAULTCALIBRO = dEFAULTCALIBRO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDEFAULTGITTATA() {
		return DEFAULTFIRERANGE;
	}

	public void setDEFAULTGITTATA(int DEFAULTFIRERANGE) {
		this.DEFAULTFIRERANGE = DEFAULTFIRERANGE;
	}

	public static int getDEFAULTFIRERANGE() {
		return DEFAULTFIRERANGE;
	}

	public static void setDEFAULTFIRERANGE(int dEFAULTFIRERANGE) {
		DEFAULTFIRERANGE = dEFAULTFIRERANGE;
	}

	
	
}
