package com.qidongyinqing.pdfreader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.qidongyinqing.pdfreader.pdfview.PDFViewPager;

public class MainActivity extends AppCompatActivity  {
    public static final String SAMPLE_FILE = "sample.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        pdfView = (PDFView)findViewById(R.id.pdfView);
//        pdfView.fromAsset(SAMPLE_FILE)
//                .defaultPage(0)
//                .onPageChange(this)
//                .enableAnnotationRendering(true)
//                .onLoad(this)
//                .scrollHandle(new DefaultScrollHandle(this))
//                .spacing(10) // in dp
//                .onPageError(this)
//                .load();

        LinearLayout llPdfRoot = ((LinearLayout) findViewById(R.id.llPdfRoot));
        PDFViewPager pdfViewPager = new PDFViewPager(this, "/storage/emulated/0/test/test.pdf");
        llPdfRoot.addView(pdfViewPager);
    }


}
