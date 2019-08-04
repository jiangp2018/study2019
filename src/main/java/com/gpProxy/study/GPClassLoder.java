package com.gpProxy.study;

//�������ɡ����롢���¶�̬load��JVM
public class GPClassLoder extends ClassLoader {
    private File baseFile;

    //�ҵ�����·��
    public GPClassLoder() {
        String basePath = GPClassLoder.class.getResource("").getPath();
        this.baseFile = new File(basePath);
    }

    public Class findClass(String className) {
        //�õ����ȫ·��
        String url = GPClassLoder.class.getPackage().getName() + className;
        if (baseFile != null) {
            InputStream in = null;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                // url ת�����ļ��������뵽jvm ��ȥ
                File file = new File(baseFile + (url.replaceAll("\\.", "/")));
                // �ȶ���д���ڴ���ȥ
                if (file.exists()) {
                    // ����
                    in = new FileInputStream(file);
                    byte[] buff = new byte[1024];
                    int len = 0;
                    // is.read(be);
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }
                    // return defineClass(className, out.toByteArray(), 0,out.size());

                    return defineClass(url, out.toByteArray(), 0, out.size());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                    in.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
