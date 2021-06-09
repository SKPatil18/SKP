import instaloader
img = instaloader.Instaloader()
dp = input("enter insta username:")
img.download_profile(dp, profile_pic=True)
