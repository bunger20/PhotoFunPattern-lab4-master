package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

/**
 *  class GrayFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to convert the image to gray scale.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */

public class GrayFilter extends PhotoFilter {

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It transforms a color pixel to gray by averaging its three RGB
    * components.
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components is their averaged
    * value
    */
    public int transformPixel(int inPixel0, int inPixel1,int inPixel2,int inPixel3,int inPixel4,int inPixel5,int inPixel6,int inPixel7,int inPixel8) {

        //int avg =  (inPixel4 );
        int intensity0 = (Color.red(inPixel0) + Color.green(inPixel0) +
                Color.blue(inPixel0)) / 3;
        int intensity1 = (Color.red(inPixel1) + Color.green(inPixel1) +
                Color.blue(inPixel1)) / 3;
        int intensity2 = (Color.red(inPixel2) + Color.green(inPixel2) +
                Color.blue(inPixel2)) / 3;
        int intensity3 = (Color.red(inPixel3) + Color.green(inPixel3) +
                Color.blue(inPixel3)) / 3;
        int intensity4 = (Color.red(inPixel4) + Color.green(inPixel4) +
                Color.blue(inPixel4)) / 3;
        int intensity5 = (Color.red(inPixel5) + Color.green(inPixel5) +
                Color.blue(inPixel5)) / 3;
        int intensity6 = (Color.red(inPixel6) + Color.green(inPixel6) +
                Color.blue(inPixel6)) / 3;
        int intensity7 = (Color.red(inPixel7) + Color.green(inPixel7) +
                Color.blue(inPixel7)) / 3;
        int intensity8 = (Color.red(inPixel8) + Color.green(inPixel8) +
                Color.blue(inPixel8)) / 3;

        int avg = (int) ((.1* intensity0 +.1* intensity1 +.1* intensity2 +.1* intensity3 +.2* intensity4 + .1* intensity5 + .1* intensity6 + .1* intensity7 + .1* intensity8 ));

        return Color.argb(Color.alpha(inPixel4), avg,avg,avg);
    }

}
