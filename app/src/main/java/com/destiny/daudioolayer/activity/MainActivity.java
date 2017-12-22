package com.destiny.daudioolayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.daudioolayer.R;
import com.destiny.daudioolayer.status.StatusBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //编辑
    private TextView tvEdit;
    //标题
    private TextView tvTitle;
    //搜索
    private ImageView ivToSearch;
    //歌曲列表
    private RecyclerView rlMusicList;
    //播放歌曲条目
    private RelativeLayout relMusicItem;
    //歌曲图片
    private ImageView ivPictureMusic;
    //歌曲名称
    private TextView tvMusicName;
    //歌手名
    private TextView tvSingerName;
    //上一首
    private ImageView ivPrevious;
    //暂停
    private ImageView ivPause;
    //下一首
    private ImageView ivNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBar.applay(this, true);
        initView();
        setlistener();
    }

    private void setlistener() {

    }

    private void initView() {


        tvEdit = (TextView) findViewById(R.id.tv_edit);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        ivToSearch = (ImageView) findViewById(R.id.iv_to_search);
        rlMusicList = (RecyclerView) findViewById(R.id.rl_music_list);
        relMusicItem = (RelativeLayout) findViewById(R.id.rel_music_item);
        ivPictureMusic = (ImageView) findViewById(R.id.iv_picture_music);
        tvMusicName = (TextView) findViewById(R.id.tv_music_name);
        tvSingerName = (TextView) findViewById(R.id.tv_singer_name);
        ivPrevious = (ImageView) findViewById(R.id.iv_previous);
        ivPause = (ImageView) findViewById(R.id.iv_pause);
        ivNext = (ImageView) findViewById(R.id.iv_next);
        tvEdit.setOnClickListener(this);
        ivToSearch.setOnClickListener(this);
        relMusicItem.setOnClickListener(this);
        ivPrevious.setOnClickListener(this);
        ivPause.setOnClickListener(this);
        ivNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_edit:
                Toast.makeText(this, "编辑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_to_search:
                startActivity(new Intent(MainActivity.this,SearchMusicActivity.class));
                break;
            case R.id.rel_music_item:
                startActivity(new Intent(MainActivity.this,MusicPlayActivity.class));
                break;
            case R.id.iv_previous:
                Toast.makeText(this, "上一首", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_pause:
                Toast.makeText(this, "开始", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_next:
                Toast.makeText(this, "下一首", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
