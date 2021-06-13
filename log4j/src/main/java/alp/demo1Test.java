package alp;
import org.apache.logging.log4j.*;
public class demo1Test {

	private static Logger log=LogManager.getLogger(demo1Test.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1;
		int b=2;
		
		log.debug("Dubugging......");
		if(a<0) {
			log.info("Object present");
		}
		if(b>0) {
			log.fatal("This is fetal");
		}
		
		if(b>a) {
			log.error("This is error");
		}
	}

}
