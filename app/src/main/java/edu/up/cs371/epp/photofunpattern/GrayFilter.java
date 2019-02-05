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
        //int avg = (int) (.1* inPixel0 +.1* inPixel1 +.1* inPixel2 +.1* inPixel3 +.2* inPixel4 + .1* inPixel5 + .1* inPixel6 + .1* inPixel7 + .1* inPixel8 )/9;
        int avg =  (inPixel4 );
        int intensity = (Color.red(avg) + Color.green(avg) +
                Color.blue(avg)) / 3;
        return Color.argb(Color.alpha(avg), intensity,intensity,intensity);
    }

}
