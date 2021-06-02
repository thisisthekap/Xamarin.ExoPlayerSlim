using Android.App;
using Android.OS;
using Android.Runtime;
using Android.Views;
using AndroidX.AppCompat.App;
using Com.Tonestro.Exoplayerslim;
using Android.Content.PM;

namespace Xamarin.ExoPlayerSlim.UsageChecker
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme.NoActionBar", MainLauncher = true)]
    public class MainActivity : AppCompatActivity
    {
        private View _videoView;
        private IExoPlayerSlim _exoPlayerSlim;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            _videoView = ExoPlayerSlimViewFactory.Create(this);
            _exoPlayerSlim = ExoPlayerSlimFactory.Create(this, "https://bitdash-a.akamaihd.net/content/MI201109210084_1/m3u8s/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.m3u8");

            _exoPlayerSlim.AttachPlayerView(_videoView,true,AspectRatios.Fit);

            _exoPlayerSlim.PlayWhenReady = true;

            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            SetContentView(_videoView);

            _exoPlayerSlim.Play();
        }

        public override bool OnCreateOptionsMenu(IMenu menu)
        {
            MenuInflater.Inflate(Resource.Menu.menu_main, menu);
            return true;
        }

        public override bool OnOptionsItemSelected(IMenuItem item)
        {
            int id = item.ItemId;
            if (id == Resource.Id.action_settings)
            {
                return true;
            }

            return base.OnOptionsItemSelected(item);
        }

        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }

        protected override void OnDestroy()
        {
            _exoPlayerSlim?.Close();
        }
    }
}
