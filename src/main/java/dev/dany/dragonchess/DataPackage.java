package dev.dany.dragonchess;

import java.io.Serializable;

/**
 *
 * @author Dany
 */
public class DataPackage implements Serializable
{
    public int aX, aY, aZ;
    public int bX, bY, bZ;
    public char dataA, dataB;
    
    public DataPackage()
    {
        aX = aY = aZ = bX = bY = bZ = 0;
        dataA = dataB = '#';
    }
}
