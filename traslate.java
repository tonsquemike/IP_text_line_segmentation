public static BufferedImage traslateBufferedImageX(BufferedImage bi, int traslation, int BufferedImageType, boolean white)
    {
        BufferedImage bo = new BufferedImage(bi.getWidth(), bi.getHeight(), BufferedImageType);
        Graphics2D g2D;
  
        if(white)
            bo = Funciones_Image.initializeBufferedImage(bo, Color.WHITE);
        
        /*g2D = bo.createGraphics();
        g2D.translate(traslation, 0);
        g2D.drawImage(bi, 0, 0, null);*/

        //System.out.println("x0 "+Math.abs(0+traslation)+" x1 = "+(bo.getWidth()+traslation));
        int start = Math.abs(traslation);
        int end = bo.getWidth()-Math.abs(traslation);
        
        for (int i = start; i < end; i++) {
            for (int j = 0; j < bo.getHeight(); j++) {
                //System.out.println("i = "+i+" it = "+(i+traslation));
                //try{
                    bo.setRGB((i-traslation), j, bi.getRGB(i, j));
                //}catch(Exception e){
                    //System.out.println("i = "+(i-traslation)+" j = "+j);
                //}
                //    System.out.println("error = "+(i+traslation)+", "+j);System.out.println("w = "+bo.getWidth()+" h = "+bo.getHeight());}
            }
        }
        
        return bo;
    }
    public static BufferedImage initializeBufferedImage(BufferedImage bi, Color c)
    {
        //System.out.printf("R = "+c.getRed()+ " G = "+c.getGreen()+" B = "+c.getBlue());
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                bi.setRGB(i, j, c.getRGB());
            }
        }
        return bi;
    }