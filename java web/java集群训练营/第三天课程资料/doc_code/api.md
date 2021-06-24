# 项目接口文档 版本

```
baseUrl: http://域名
```



## 接口列表：

### 1、获取导航链接集

#### 请求URL:  

```
baseUrl/links
```

#### 请求方式: 

```
get
```

#### 

#### 返回示例：

```javascript
{
  "data": [
    {
      "links": [
        {
          "content": "http://www.github.com/",
          "count": 0,
          "description": "GitHub 是一个面向开源及私有软件项目的托管平台",
          "icon": 1,
          "id": 94,
          "sort": 1,
          "title": "GitHub",
          "typeId": 1
        },
        {
          "content": "https://www.oschina.net/",
          "count": 0,
          "description": "开源中国是目前国内最大的开源技术社区",
          "icon": 1,
          "id": 95,
          "sort": 2,
          "title": "开源中国",
          "typeId": 1
        },
        {
          "content": "https://www.zhihu.com/",
          "count": 0,
          "description": "有问题,上知乎。知乎,可信赖的问答社区",
          "icon": 1,
          "id": 96,
          "sort": 3,
          "title": "知乎",
          "typeId": 1
        },
        {
          "content": "https://www.bilibili.com/",
          "count": 0,
          "description": "哔哩哔哩 (゜-゜)つロ 干杯~-bilibili",
          "icon": 1,
          "id": 97,
          "sort": 4,
          "title": "哔哩哔哩",
          "typeId": 1
        },
        {
          "content": "https://www.jianshu.com/",
          "count": 0,
          "description": "简书是一个优质的创作社区",
          "icon": 1,
          "id": 98,
          "sort": 5,
          "title": "简书",
          "typeId": 1
        },
        {
          "content": "https://toutiao.io/",
          "count": 0,
          "description": "程序员必逛刷题平台",
          "icon": 1,
          "id": 99,
          "sort": 6,
          "title": "LeetCode",
          "typeId": 1
        },
        {
          "content": "https://shimo.im/",
          "count": 0,
          "description": "石墨文档是云 Office 办公软件",
          "icon": 2,
          "id": 100,
          "sort": 7,
          "title": "石墨文档",
          "typeId": 1
        },
        {
          "content": "https://www.csdn.net/",
          "count": 0,
          "description": "CSDN是全球知名中文IT技术交流平台",
          "icon": 2,
          "id": 101,
          "sort": 8,
          "title": "CSDN",
          "typeId": 1
        },
        {
          "content": "html/ideakeys.html",
          "count": 0,
          "description": "精心整理常用IDEA快捷键和快捷键大全",
          "icon": 5,
          "id": 102,
          "sort": 9,
          "title": "IDEA快捷键",
          "typeId": 1
        },
        {
          "content": "https://imgchr.com/",
          "count": 0,
          "description": "路过图床-高速稳定的图片上传和外链服务，全球CDN加速",
          "icon": 2,
          "id": 103,
          "sort": 10,
          "title": "路过图床",
          "typeId": 1
        },
        {
          "content": "https://www.iconfont.cn/",
          "count": 0,
          "description": "国内功能很强大且图标内容很丰富的矢量图标库",
          "icon": 1,
          "id": 104,
          "sort": 11,
          "title": "iconfont",
          "typeId": 1
        },
        {
          "content": "https://www.aliyun.com/minisite/goods?userCode=k6ji3ksd",
          "count": 0,
          "description": "上云优惠聚集地",
          "icon": 2,
          "id": 105,
          "sort": 12,
          "title": "阿里云",
          "typeId": 1
        }
      ],
      "type": "热门推荐"
    },
    {
      "links": [
        {
          "content": "https://mp.weixin.qq.com/s/eH8BrXSADs5826pd5QRcKg",
          "count": 0,
          "description": "看到这些程序员图片 ， 笑哭了！",
          "icon": 1,
          "id": 106,
          "sort": 1,
          "title": "必备表情包",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/McTNUcYhfbrfZYyjEbP83g",
          "count": 0,
          "description": "老板竟然要求程序员写出一个有Bug的程序！",
          "icon": 4,
          "id": 107,
          "sort": 2,
          "title": "领导让写bug",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/bDKkdyHDsY46MJBuVkn90w",
          "count": 0,
          "description": "一套漫画，让你了解程序员日常 ！内容太真实了。",
          "icon": 1,
          "id": 108,
          "sort": 3,
          "title": "漫画版程序员日常",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/XgwgoF7QWyLd2V5p0o2yHg",
          "count": 0,
          "description": "冬天到了， 程序员难道还穿格子衫过冬？被真相笑死了。",
          "icon": 3,
          "id": 109,
          "sort": 4,
          "title": "程序员的格子衫",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/3AlJARUriH_FZPTif-TSvg",
          "count": 0,
          "description": "旧新闻：项目上线 ， 他们杀了一个程序员祭天",
          "icon": 4,
          "id": 110,
          "sort": 5,
          "title": "杀程序员祭天",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/xBRseELXc_Nmpr34SA44-w",
          "count": 0,
          "description": "说起产品经理与程序员，简直就是一对冤家。",
          "icon": 3,
          "id": 111,
          "sort": 6,
          "title": "程序员又打产品",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/l3Y6IZMGScSv-2kxZu5qWA",
          "count": 0,
          "description": "找个程序员做男友，哈哈哈哈哈哈生活太难了",
          "icon": 1,
          "id": 112,
          "sort": 7,
          "title": "程序员男友？",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/CWYFv2m1ENGnENzNcACJvA",
          "count": 0,
          "description": "超搞笑：一图看懂HTML，CSS 和 JavaScript 以及 Java有什么区别",
          "icon": 2,
          "id": 113,
          "sort": 8,
          "title": "HTML、CSS的区别",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/hx4BwaxwKU_KHzjDwRd0sA",
          "count": 0,
          "description": "让程序员们崩溃的40个瞬间",
          "icon": 1,
          "id": 114,
          "sort": 9,
          "title": "程序员崩溃瞬间",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/FDvAgipjm3rw24F4rcVc_Q",
          "count": 0,
          "description": "笑崩。有了这些程序猿神器，你就是这条街最亮的仔",
          "icon": 1,
          "id": 115,
          "sort": 10,
          "title": "程序员神器",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/IxHjqGdJxmy_9axsxbUVcQ",
          "count": 0,
          "description": "666，美国程序员上班逗猫，把工作外包给中国程序员~",
          "icon": 4,
          "id": 116,
          "sort": 11,
          "title": "程序员骚操作",
          "typeId": 2
        },
        {
          "content": "https://mp.weixin.qq.com/s/tuS-kxDTAtXCYKU3MFVkmg",
          "count": 0,
          "description": "常有人说，“那些只学了XX语言的人，编程能力都退化成什么样了？”",
          "icon": 4,
          "id": 117,
          "sort": 12,
          "title": "工程师和码农区别",
          "typeId": 2
        }
      ],
      "type": "轻松一刻（程序员）"
    },
    {
      "links": [
        {
          "content": "https://www.templatemonster.com/cn/",
          "count": 0,
          "description": "著名的网页模版库，借鉴和学习网页趋势的宝地",
          "icon": 1,
          "id": 118,
          "sort": 1,
          "title": "网页模版巨人",
          "typeId": 3
        },
        {
          "content": "https://onepagelove.com/",
          "count": 0,
          "description": "推荐！提供海量单页模版展示和素材资源的网站",
          "icon": 1,
          "id": 119,
          "sort": 2,
          "title": "迷你网站模版分享",
          "typeId": 3
        },
        {
          "content": "https://www.landingfolio.com/",
          "count": 0,
          "description": "推荐！整合了各个行业的网站登录页面模版资源",
          "icon": 1,
          "id": 120,
          "sort": 3,
          "title": "登录界面模版网",
          "typeId": 3
        },
        {
          "content": "https://templates.entheosweb.com/",
          "count": 0,
          "description": "强大的模板库，包括最流行的响应式网页、HTML5酷站",
          "icon": 1,
          "id": 121,
          "sort": 4,
          "title": "Entheos Templates",
          "typeId": 3
        },
        {
          "content": "http://www.dreamtemplate.com/",
          "count": 0,
          "description": "超过7000个梦幻般的网站模板及Flash模板",
          "icon": 1,
          "id": 122,
          "sort": 5,
          "title": "梦幻模板",
          "typeId": 3
        },
        {
          "content": "https://www.templateworld.com/",
          "count": 0,
          "description": "提供各种专业的网页开发模板，记得利用好左侧的分类",
          "icon": 1,
          "id": 123,
          "sort": 6,
          "title": "网页模版世界",
          "typeId": 3
        },
        {
          "content": "https://www.wix.com/",
          "count": 0,
          "description": "超赞！该站全球排名378！可以帮你免费定制网站",
          "icon": 2,
          "id": 124,
          "sort": 7,
          "title": "享誉全球的 WIX",
          "typeId": 3
        },
        {
          "content": "https://www.freewebtemplates.com/",
          "count": 0,
          "description": "历史悠久的老站点，1999年就致力于分享免费网站模版",
          "icon": 2,
          "id": 125,
          "sort": 8,
          "title": "免费模版库",
          "typeId": 3
        },
        {
          "content": "https://templated.co/",
          "count": 0,
          "description": "免费响应式模版分享网，汇集了一大批优质网站作品",
          "icon": 2,
          "id": 126,
          "sort": 9,
          "title": "Templated",
          "typeId": 3
        },
        {
          "content": "http://www.buytemplates.net/products/search",
          "count": 0,
          "description": "一个卖网页模版的站点",
          "icon": 3,
          "id": 127,
          "sort": 10,
          "title": "Buy Templates",
          "typeId": 3
        },
        {
          "content": "https://themeforest.net/category/site-templates",
          "count": 0,
          "description": "TF下的频道，业内最大的网站模板和CMS主题商城之一",
          "icon": 3,
          "id": 128,
          "sort": 11,
          "title": "ThemeForest",
          "typeId": 3
        },
        {
          "content": "https://www.gavick.com/",
          "count": 0,
          "description": "惊人且美丽的Joomla模板和WordPress主题",
          "icon": 5,
          "id": 129,
          "sort": 12,
          "title": "GavickPro",
          "typeId": 3
        }
      ],
      "type": "网站模版"
    },
    {
      "links": [
        {
          "content": "https://tech.meituan.com/",
          "count": 0,
          "description": "美团团队技术博客",
          "icon": 1,
          "id": 130,
          "sort": 1,
          "title": "美团团队",
          "typeId": 4
        },
        {
          "content": "https://blog.klmobile.app/",
          "count": 0,
          "description": "网易考拉技术团队",
          "icon": 1,
          "id": 131,
          "sort": 2,
          "title": "网易考拉团队",
          "typeId": 4
        },
        {
          "content": "https://joyrun.github.io/",
          "count": 0,
          "description": "悦跑圈技术团队",
          "icon": 3,
          "id": 132,
          "sort": 3,
          "title": "悦跑圈团队",
          "typeId": 4
        },
        {
          "content": "https://tech.youzan.com/",
          "count": 0,
          "description": "有赞技术团队",
          "icon": 3,
          "id": 133,
          "sort": 4,
          "title": "有赞团队",
          "typeId": 4
        },
        {
          "content": "http://jm.taobao.org/",
          "count": 0,
          "description": "阿里中间件团队博客",
          "icon": 3,
          "id": 134,
          "sort": 5,
          "title": "阿里中间件团队",
          "typeId": 4
        },
        {
          "content": "https://blogs.360.cn/",
          "count": 0,
          "description": "360核心安全技术团队博客",
          "icon": 3,
          "id": 135,
          "sort": 6,
          "title": "360核心安全团队",
          "typeId": 4
        },
        {
          "content": "https://tech.glowing.com/cn/",
          "count": 0,
          "description": "Glow 技术团队博客",
          "icon": 3,
          "id": 136,
          "sort": 7,
          "title": "Glow团队",
          "typeId": 4
        },
        {
          "content": "https://blog.qiniu.com/archives/category/5",
          "count": 0,
          "description": "七牛云技术团队博客",
          "icon": 3,
          "id": 137,
          "sort": 8,
          "title": "七牛云团队",
          "typeId": 4
        },
        {
          "content": "http://google-opensource.blogspot.hk/  ",
          "count": 0,
          "description": "google开源产品项目博客（墙）",
          "icon": 3,
          "id": 138,
          "sort": 9,
          "title": "google开源博客",
          "typeId": 4
        },
        {
          "content": "https://blog.twitter.com/engineering",
          "count": 0,
          "description": "Twitter技术团队博客（墙）",
          "icon": 3,
          "id": 139,
          "sort": 10,
          "title": "Twitter团队",
          "typeId": 4
        },
        {
          "content": "https://code.facebook.com",
          "count": 0,
          "description": "FaceBook技术团队博客（墙）",
          "icon": 3,
          "id": 140,
          "sort": 11,
          "title": "FaceBook团队",
          "typeId": 4
        },
        {
          "content": "http://square.github.io/",
          "count": 0,
          "description": "Square技术团队，是业界开源项目最多的公司之一（墙）",
          "icon": 3,
          "id": 141,
          "sort": 12,
          "title": "Square团队",
          "typeId": 4
        }
      ],
      "type": "行业名博"
    },
    {
      "links": [
        {
          "content": "https://www.w3.org/",
          "count": 0,
          "description": "这是互联网的基础，推荐及时了解前端最新资讯",
          "icon": 1,
          "id": 142,
          "sort": 1,
          "title": "W3C官网",
          "typeId": 5
        },
        {
          "content": "https://www.runoob.com/",
          "count": 0,
          "description": "菜鸟教程 - 学的不仅是技术,更是梦想!",
          "icon": 1,
          "id": 143,
          "sort": 2,
          "title": "菜鸟教程",
          "typeId": 5
        },
        {
          "content": "https://www.huxiu.com/",
          "count": 0,
          "description": "一个有视角的、个性化商业资讯与交流平台",
          "icon": 1,
          "id": 144,
          "sort": 3,
          "title": "虎嗅网",
          "typeId": 5
        },
        {
          "content": "http://www.w3school.com.cn/",
          "count": 0,
          "description": "全球最大的中文Web技术教程",
          "icon": 0,
          "id": 145,
          "sort": 4,
          "title": "w3school在线教程",
          "typeId": 5
        },
        {
          "content": "http://www.geekpark.net/",
          "count": 0,
          "description": "报道互联网热门趋势、热点产品的深度分析。",
          "icon": 1,
          "id": 146,
          "sort": 5,
          "title": "极客公园",
          "typeId": 5
        },
        {
          "content": "https://www.cnbeta.com/",
          "count": 0,
          "description": "提供最新最快的IT业界资讯",
          "icon": 1,
          "id": 147,
          "sort": 6,
          "title": "cnBeta中文IT资讯站",
          "typeId": 5
        },
        {
          "content": "https://www.leiphone.com/",
          "count": 0,
          "description": "专注于移动互联网创业及创新的人气科技博客",
          "icon": 2,
          "id": 148,
          "sort": 7,
          "title": "雷锋网",
          "typeId": 5
        },
        {
          "content": "http://www.donews.com/",
          "count": 0,
          "description": "中国互联网从业人士交流最权威的平台",
          "icon": 2,
          "id": 149,
          "sort": 8,
          "title": "DoNews",
          "typeId": 5
        },
        {
          "content": "http://tech.163.com/",
          "count": 0,
          "description": "有态度！以独特视角呈现科技圈内大事小事",
          "icon": 2,
          "id": 150,
          "sort": 9,
          "title": "网易科技",
          "typeId": 5
        },
        {
          "content": "http://www.newhua.com/",
          "count": 0,
          "description": "华军软件园旗下网站，第一时间提供最具价值IT资讯",
          "icon": 3,
          "id": 151,
          "sort": 10,
          "title": "牛华网",
          "typeId": 5
        },
        {
          "content": "https://www.liaoxuefeng.com/",
          "count": 0,
          "description": "研究互联网产品和技术,提供原创中文精品教程.",
          "icon": 5,
          "id": 152,
          "sort": 11,
          "title": "廖雪峰",
          "typeId": 5
        }
      ],
      "type": "互联网讯"
    },
    {
      "links": [
        {
          "content": "https://mp.weixin.qq.com/s/FGeedIDVqB9jM70Os-q16w",
          "count": 0,
          "description": "五个刁钻的String面试问题及解答",
          "icon": 1,
          "id": 153,
          "sort": 1,
          "title": "五个刁钻的String问题解答",
          "typeId": 6
        },
        {
          "content": "https://mp.weixin.qq.com/s/FlooNgJmVnGREWHVB2qYbw",
          "count": 0,
          "description": "Spring用了哪些设计模式",
          "icon": 1,
          "id": 154,
          "sort": 2,
          "title": "Spring用了哪些设计模式",
          "typeId": 6
        },
        {
          "content": "https://blog.csdn.net/liliangpin/article/details/99792158",
          "count": 0,
          "description": "阿里三面经验",
          "icon": 1,
          "id": 155,
          "sort": 3,
          "title": "阿里三面经验",
          "typeId": 6
        },
        {
          "content": "https://mp.weixin.qq.com/s/UtBLaH18LYlWl8Amy0t4Ug",
          "count": 0,
          "description": "300道精选面试题",
          "icon": 0,
          "id": 156,
          "sort": 4,
          "title": "300道精选面试题",
          "typeId": 6
        },
        {
          "content": "https://www.jianshu.com/p/c9acbd4639dd",
          "count": 0,
          "description": "Java面试攻略",
          "icon": 1,
          "id": 157,
          "sort": 5,
          "title": "Java面试攻略",
          "typeId": 6
        },
        {
          "content": "https://baijiahao.baidu.com/s?id=1643207505129754122&wfr=spider&for=pc",
          "count": 0,
          "description": "阿里面试经验和技巧",
          "icon": 5,
          "id": 158,
          "sort": 6,
          "title": "阿里面试经验和技巧",
          "typeId": 6
        },
        {
          "content": "https://blog.csdn.net/liliangpin/article/details/99792158",
          "count": 0,
          "description": "阿里三面经验",
          "icon": 1,
          "id": 159,
          "sort": 7,
          "title": "阿里三面经验",
          "typeId": 6
        },
        {
          "content": "https://mp.weixin.qq.com/s/UtBLaH18LYlWl8Amy0t4Ug",
          "count": 0,
          "description": "300道精选面试题",
          "icon": 0,
          "id": 160,
          "sort": 8,
          "title": "300道精选面试题",
          "typeId": 6
        },
        {
          "content": "https://www.jianshu.com/p/c9acbd4639dd",
          "count": 0,
          "description": "Java面试攻略",
          "icon": 1,
          "id": 161,
          "sort": 9,
          "title": "Java面试攻略",
          "typeId": 6
        },
        {
          "content": "https://baijiahao.baidu.com/s?id=1643207505129754122&wfr=spider&for=pc",
          "count": 0,
          "description": "阿里面试经验和技巧",
          "icon": 5,
          "id": 162,
          "sort": 10,
          "title": "阿里面试经验和技巧",
          "typeId": 6
        }
      ],
      "type": "面试经验"
    },
    {
      "links": [
        {
          "content": "https://mp.weixin.qq.com/s/63wCyc2wOHfZpklo2-5Iqw",
          "count": 0,
          "description": "程序老鸟才能理解的行话",
          "icon": 1,
          "id": 163,
          "sort": 1,
          "title": "程序老鸟行话",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/r4qNcxrF95HEoipfHBqd7w",
          "count": 0,
          "description": "程序员在各种人眼中的形象",
          "icon": 1,
          "id": 164,
          "sort": 2,
          "title": "程序员形象",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/dE6Ko87n4H7Ih-S-u4T7uA",
          "count": 0,
          "description": "女程序的一个Twitter引来了一堆神级评论",
          "icon": 1,
          "id": 165,
          "sort": 3,
          "title": "神级评论",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/gu4ge9xSQC3-9l1MMM0eaw",
          "count": 0,
          "description": "程序员遇到最“奇葩”的需求竟然是。。。",
          "icon": 1,
          "id": 166,
          "sort": 4,
          "title": "奇葩需求",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/_GzZ_3DX4BpoBb7smRj1Sw",
          "count": 0,
          "description": "程序员是世界上最符合女神要求的职业",
          "icon": 2,
          "id": 167,
          "sort": 5,
          "title": "找女友的天然优势",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/6zXQvtWMp69kYTiXNFkx-w",
          "count": 0,
          "description": "一大波程序员必备表情包",
          "icon": 3,
          "id": 168,
          "sort": 6,
          "title": "程序表情包",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/9Vs8mYIzv34_J55CI9NYTQ",
          "count": 0,
          "description": "直击灵魂：程序员11问禅师。好笑又心酸！",
          "icon": 1,
          "id": 169,
          "sort": 7,
          "title": "程序员与禅师",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/Rxoz79QyZhQv-CoDvplNbA",
          "count": 0,
          "description": "让你笑到肚子痛的搞笑程序员动图表情包",
          "icon": 3,
          "id": 170,
          "sort": 8,
          "title": "搞笑程序动图",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/sqChrg5t104Y67_PfHuJRQ",
          "count": 0,
          "description": "程序员找工作中的职位描述 和 现实",
          "icon": 2,
          "id": 171,
          "sort": 9,
          "title": "理想与现实",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/7T1KzMUcwl8AXuMompXzvQ",
          "count": 0,
          "description": "做程序员多年 ，你写过多少笑死人不偿命的代码？",
          "icon": 1,
          "id": 172,
          "sort": 10,
          "title": "笑死人代码",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/KteCFLey7rC-OImc53_sVw",
          "count": 0,
          "description": "搞笑程序员与产品经理相爱相杀漫画",
          "icon": 2,
          "id": 173,
          "sort": 11,
          "title": "与产品如何厮杀",
          "typeId": 7
        },
        {
          "content": "https://mp.weixin.qq.com/s/HEYf8AxOzrR1MshsKgQHWA",
          "count": 0,
          "description": "人工智障又双叒叕出事了，哈哈哈哈哈",
          "icon": 2,
          "id": 174,
          "sort": 12,
          "title": "人工智障",
          "typeId": 7
        }
      ],
      "type": "轻松二刻（程序员）"
    }
  ],
  "msg": "加载成功",
  "status": 0
}
```



#### 
