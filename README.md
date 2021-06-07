# Xamarin.ExoPlayerSlim

Slim bindings for [ExoPlayer](https://github.com/google/ExoPlayer). Using the awesome [Xamarin.Binding.Helpers](https://github.com/Redth/Xamarin.Binding.Helpers) from Jonathan Dick ([@Redth](https://github.com/Redth)).

As this is a slim binding library, this repository is NOT aiming for full API coverage. Please see the java code located in https://github.com/thisisthekap/Xamarin.ExoPlayerSlim/tree/main/java/ExoPlayerSlim/exoplayerslim/src/main/java/com/tonestro/exoplayerslim on how the slim binding uses ExoPlayer.

## NuGet Feed

NuGet packages are built using Azure DevOps: [![Build Status](https://funmusic.visualstudio.com/Xamarin%20ExoPlayerSlim/_apis/build/status/Xamarin.ExoPlayerSlim%20public?branchName=refs%2Ftags%2Frelease-bindings-v2.14.0.15)](https://funmusic.visualstudio.com/Xamarin%20ExoPlayerSlim/_build/latest?definitionId=170&branchName=refs%2Ftags%2Frelease-bindings-v2.14.0.15)

NuGet packages are published on [nuget.org](https://www.nuget.org/packages/Xamarin.ExoPlayerSlim/).

## Versioning Scheme

The versioning scheme of `Xamarin.ExoPlayerSlim` is derived from the versioning of [google/ExoPlayer](https://github.com/google/ExoPlayer).

### Example:

| google/ExoPlayer | Xamarin.ExoPlayerSlim | Note |
|:--|:--|:--|
| 1.2.3 | 1.2.3.1 | First version of bindings for 1.2.3 |
| 1.2.3 | 1.2.3.17 | Bindings for 1.2.3 containing fixes |
