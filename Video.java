
class Vodio {
    public static void main(String[] args){
    
                String url = "http://f.us.sinaimg.cn/000Enus5lx07tR6BD452010412007iy30E010.mp4?label=mp4_720p&template=1280x720.23.0&Expires=1558357405&ssig=QTdUzYHeXS&KID=unistore,video";
                HttpURLConnection con;
                FileOutputStream fs = null;
                InputStream is;
                BufferedInputStream bs = null;
                File file = new File("D:/hj/"+new Date().getTime()+".mp4");
                file.createNewFile();
        
        try {
                con = (HttpURLConnection) new URL(url).openConnection();
         con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        
        //输入流
         is = con.getInputStream();
      bs = new BufferedInputStream(is);
       //outStream
         fs = new FileOutputStream(file);
        byte [] bytes = new byte[1024];
        
   int line ;
         //write
   while((line = bs.read(bytes))!= -1){
 fs.write(bytes, 0, line);
   fs.flush();
   }
 
  } catch (Exception e) {
        e.printStackTrace();
         } finally{
       
 if(fs!= null){
  try {
        fs.close();
        } catch (IOException e) {
        e.printStackTrace();
 }
}
 if(bs!=null){
  try {
     bs.close();
        } catch (IOException e) {
       
            e.printStackTrace();  
      }

               
            }

    }
}
}
    }
}