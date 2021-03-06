package com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.util;


import com.jumbodinosaurs.mcdevlib.OneDotTwelve.util.minecraft.GameHelper;

public class TextDrawer
{
   
    
    
    public static void drawString(String message, int x, int y, String color) throws NumberFormatException
    {
        if(GameHelper.getFontRender() != null)
        {
            GameHelper.getFontRender().drawString(message, x, y, Integer.parseInt(color, 16));
        }
    }
    
    public static void drawStringCentered(String message, int x, int y, String color) throws NumberFormatException
    {
        if(GameHelper.getFontRender() != null)
        {
            drawString(message, x - (GameHelper.getFontRender().getStringWidth(message) / 2), y, color);
        }
    }
    
    public static void drawStringXEndPoint(String message, int x, int y, String color) throws NumberFormatException
    {
        if(GameHelper.getFontRender() != null)
        {
            drawString(message, x - GameHelper.getFontRender().getStringWidth(message), y, color);
        }
    }
    
    
    
}
