package is.com;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.iscom.sharedprefs.R;

public class Media extends ActionBarActivity {
    MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        mplayer = MediaPlayer.create(this, R.raw.laugh);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void playAudio(View view) {
        mplayer.start();
    }

    public void pauseAudio(View view) {
        mplayer.pause();
    }
}
