package GIS;

import Geom.Point3D;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Algorithms.Path;
import GIS.*;
import Game.Map;

public class Packman implements Types{
	private Point3D p ;
	private int id=0;
	private static int tempId=1;
	private double speed;
	private double r;
	Map M=new Map();
	public Path path;
	//String timeStamp;


	/*
	 *constructor for Packman recieving string string   
	 */
	public Packman(String id,String Lat1 ,String Lon1 ,String Alt1, String Speed1, String radius1) {
		double Lat=Double.parseDouble(Lat1);
		double Lon=Double.parseDouble(Lon1);
		double Alt=Double.parseDouble(Alt1);
		double Speed=Double.parseDouble(Speed1);
		double radius=Double.parseDouble(radius1);
		int idi = Integer.parseInt(id);
		this.id=idi;
		this.p = new Point3D(Lat,Lon,Alt);
		this.speed=Speed;
		this.r=radius;
		this.path=new Path();
		this.path.getP().add(p);
		//String ts = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss").format(Calendar.getInstance().getTime());
		//this.timeStamp=ts;
		//this.path.getTimeStamps().add(ts);
	}
	/*
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	 */
	/*
	 * constructor for packman recieving double as parameters
	 */
	public Packman(int id,double Lat ,double Lon ,double Alt, double Speed, double radius) {
		this.p = new Point3D(Lat,Lon,Lat);
		this.speed=Speed;
		this.r=radius;
		this.id=id;
		this.path=new Path();
		this.path.getP().add(p);
		//String ts = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss").format(Calendar.getInstance().getTime());
		//this.timeStamp=ts;
		//this.path.getTimeStamps().add(ts);
	}
	/*
	 * Constructor for packman in pixel
	 */
	public Packman(int PixelsX,int PixelsY) {
		this.p=M.pixels2polar(PixelsX,PixelsY);
		this.speed=1;
		this.r=1;
		this.id=this.tempId++;
		this.path=new Path();
		this.path.getP().add(p);
		//	String ts = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss").format(Calendar.getInstance().getTime());
		//	this.timeStamp=ts;
		//	this.path.getTimeStamps().add(ts);
	}
	public void setNewCoords(int id,double Lat ,double Lon ,double Alt) { //
		this.id=id;
		this.p =new Point3D(Lat ,Lon,Alt);
	}
	/*
	 * (non-Javadoc)
	 * @see GIS.Types#getLocation()
	 * @return return Point 
	 */
	public Point3D getLocation() {
		return p;
	}
	/*
	 * @return return point in pixels
	 */
	public Point3D getLocationInPixels() {
		return M.polar2pixels(p);
	}
	/*
	 * set the location of the packman for the 
	 * @param the given point
	 */
	public void setP(Point3D p) {
		this.p = p;
	}
	/*
	 * @return return the speed of the packman
	 */
	public double getSpeed() {
		return speed;
	}
	/*
	 * setting the speed of te packman
	 * @param the given speed
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	/*
	 * @return return the radius of the packman
	 */
	public double getR() {
		return r;
	}
	/*
	 * setting the radius of the packman
	 * @param the given radius
	 */
	public void setR(double r) {
		this.r = r;
	}
	//(END)
	/*
	 * @retrun return the path of the packman
	 */
	public Path getPath() {
		return path;
	}
	/*
	 * setting the path for the packman
	 */
	public void setPath(Path thePath) {
		this.path = thePath;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}







