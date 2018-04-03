# pdf模板加入数据生成pdf文档
第一步：需要先创建word文档，并在需要写入数据的位置空格。

第二步：将word 文档生成pdf模板，通过Adobe Acrobat pro软件将word文档转换成pdf模板

[下载Adobe Acrobat pro软件] (http://pan.baidu.com/s/1pL2klzt)

第三步：打开软件，然后导入word文档后，点击软件右边的"准备表单"按钮，然后出现选择开始的界面，点击选择开始并保存后，进入到

编辑界面，点击 添加文本域的按钮在需要填写数据的地方，文本域可以编辑字体的大小，和字体对齐方式，文本域的名称要与类对象的属性名称一致。

编辑完成后重新保存。
[参考样例] (http://blog.csdn.net/top__one/article/details/65442390)


#注意事项

pdf模板要引入的jar包有两种，以第一种为主，第一种为第二种的升级jar

第一种
        <dependency>  
            <groupId>com.itextpdf</groupId>  
            <artifactId>itextpdf</artifactId>  
            <version>5.0.6</version>  
        </dependency>  
        
  第二种      
    
        <dependency> 
         <groupId>com.lowagie</groupId>
		    <artifactId>itext</artifactId>
		    <version>2.1.7</version>
        </dependency> 
       
   
# 启动服务

 
        
        
