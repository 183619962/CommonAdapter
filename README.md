##关于commonadapter
### CommonAdapter
 - 公共适配器，将adapter中公共部分提炼出来，以方便adapter的书写已经减少开发中的代码凉及工作量

### 使用方法
 - 只需要继承commonAdapter实现comvert方法，通过方法传递的holder以及bean去获取控件然后为其赋值（具体值通过bean去get）。
‘public void convert(ViewHolder holder, final Person person) {
((TextView) holder.getView(R.id.name)).setText(person.getName());
}’








---

---

---




##关于图片加载
 - imagecache.jar
>详细的代码请见[imagecache](https://github.com/183619962/imagecache)

###使用方法

**实例化ImageFetcher（两种方式）**
#####1.指定图片的缩放宽高
- ImageFetcher imageFetcher1=ImageFetcher.getInstance(Context context,int imageWidth, int imageHeight, String imageCacheDir,float memCacheSize);

###### 参数解释
 1.	content  上下文对象  如：MainActivity.this
 2.	imageWidth  图片处理的宽度 如：100
 3.	imageHeight 图片处理的高度 如：100
 4.	imageCacheDir 图片缓存的文件夹名称 如：‘MyImagecache’
 5.memCacheSize 缓存区间的大小 如：0.25f 表示磁盘大小的25%





#####2.指定一个参数，相同的高宽
- ImageFetcher imageFetcher=ImageFetcher.getInstance(Context context, int imageThumSize,String imageCacheDir,float memCacheSize);
- 参数解释
 ######1.content  上下文对象  如：MainActivity.this
 ######2.imageThumSize  图片处理的size 如：100（实际是高=宽=100）
 ######3.imageCacheDir 图片缓存的文件夹名称 如：‘MyImagecache’
 ######4.memCacheSize 缓存区间的大小 如：0.25f 表示磁盘大小的25%


**加载图片**

imageFetcher.loadImage(String url, ImageView imageView);

参数就不解释了，213都知道啥意思。

哦了，公共的commonAdapter加上list的item动态加载图片搞定。
