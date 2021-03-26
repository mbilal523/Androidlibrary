Androidlibrary


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.mbilal523:Androidlibrary:Tag'
	}
  
  
 MusicPlayer musicPlayer = new MusicPlayer(context); /// pass context
 
 musicPlayer.play(AssetFileDescriptor) /// Pass AssetFileDescriptor
 
 
 Example :
 
  MusicPlayer musicPlayer = new MusicPlayer(this);

        try {
            AssetFileDescriptor descriptor = getAssets().openFd("office_phone_ringigng.mp3");
            musicPlayer.play(descriptor);
        } catch (IOException e) {
            e.printStackTrace();
        }
