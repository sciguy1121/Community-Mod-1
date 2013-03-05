  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Community-Mod-1/common/BlocksHelper.java at master · cman8396/Community-Mod-1</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="http://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="2QJwCDiNKkIl21h25yts2R0LaeGLgIYW5XT/QollKM0=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-10558550f11b1ee140f4cc119f324097a017b244.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-5f01d9908267bc69820a10a5e9a29c9a53c586c2.css" media="screen" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-898c2db1f151d566cfe6a57c33338e30b3b75033.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-633f8ca68bd2b56ddea84b8fba1a319630658542.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="0103203ca27b96f4188863cab07321bf">

        <link data-pjax-transient rel='permalink' href='/cman8396/Community-Mod-1/blob/89649f2c6c1f11f89f02208f79730462362b54f7/common/BlocksHelper.java'>
    <meta property="og:title" content="Community-Mod-1"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/cman8396/Community-Mod-1"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/8fe58c2bd3b53288ff8054c663c77aff?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Community-Mod-1. Contribute to Community-Mod-1 development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="cman8396/Community-Mod-1"/>

    <meta name="description" content="Community-Mod-1. Contribute to Community-Mod-1 development by creating an account on GitHub." />

      <meta name="robots" content="noindex, nofollow">
  <link href="https://github.com/cman8396/Community-Mod-1/commits/master.atom" rel="alternate" title="Recent Commits to Community-Mod-1:master" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows vis-public fork env-production  ">
    <div id="wrapper">

      

      

      

      


        <div class="header header-logged-in true">
          <div class="container clearfix">

            <a class="header-logo-blacktocat" href="https://github.com/">
  <span class="mega-icon mega-icon-blacktocat"></span>
</a>

            <div class="divider-vertical"></div>

              <a href="/notifications" class="notification-indicator tooltipped downwards" title="You have no unread notifications">
    <span class="mail-status all-read"></span>
  </a>
  <div class="divider-vertical"></div>


              <div class="command-bar js-command-bar  ">
      <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">
  <a href="/search/advanced" class="advanced-search-icon tooltipped downwards command-bar-search" id="advanced_search" title="Advanced search"><span class="mini-icon mini-icon-advanced-search "></span></a>

  <input type="text" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" data-username="cman8396" autocapitalize="off">

  <span class="mini-icon help tooltipped downwards" title="Show command bar help">
    <span class="mini-icon mini-icon-help"></span>
  </span>

  <input type="hidden" name="ref" value="commandbar">

  <div class="divider-vertical"></div>
</form>
  <ul class="top-nav">
      <li class="explore"><a href="https://github.com/explore">Explore</a></li>
      <li><a href="https://gist.github.com">Gist</a></li>
      <li><a href="/blog">Blog</a></li>
    <li><a href="http://help.github.com">Help</a></li>
  </ul>
</div>


            

  
    <ul id="user-links">
      <li>
        <a href="https://github.com/cman8396" class="name">
          <img height="20" src="https://secure.gravatar.com/avatar/8fe58c2bd3b53288ff8054c663c77aff?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /> cman8396
        </a>
      </li>
      <li>
        <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a new repo">
          <span class="mini-icon mini-icon-create"></span>
        </a>
      </li>
      <li>
        <a href="/settings/profile" id="account_settings"
          class="tooltipped downwards"
          title="Account settings ">
          <span class="mini-icon mini-icon-account-settings"></span>
        </a>
      </li>
      <li>
        <a href="/logout" data-method="post" id="logout" class="tooltipped downwards" title="Sign out">
          <span class="mini-icon mini-icon-logout"></span>
        </a>
      </li>
    </ul>



            
          </div>
        </div>


      

      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              


<ul class="pagehead-actions">

    <li class="nspr">
      <a href="/cman8396/Community-Mod-1/pull/new/master" class="button minibutton btn-pull-request" icon_class="mini-icon-pull-request"><span class="mini-icon mini-icon-pull-request"></span>Pull Request</a>
    </li>

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="2QJwCDiNKkIl21h25yts2R0LaeGLgIYW5XT/QollKM0=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="8539316" />

    <div class="select-menu js-menu-container js-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">
          <span class="mini-icon mini-icon-unwatch"></span>
          Unwatch
        </span>
      </span>

      <div class="select-menu-modal-holder js-menu-content">
        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="mini-icon mini-icon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container js-select-menu-pane">

            <div class="select-menu-item js-navigation-item js-navigation-target ">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for discussions in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-watching"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item js-navigation-target selected">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item js-navigation-target ">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

    <li class="js-toggler-container js-social-container starring-container ">
      <a href="/cman8396/Community-Mod-1/unstar" class="minibutton js-toggler-target star-button starred upwards" title="Unstar this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="mini-icon mini-icon-remove-star"></span>
        <span class="text">Unstar</span>
      </a>
      <a href="/cman8396/Community-Mod-1/star" class="minibutton js-toggler-target star-button unstarred upwards" title="Star this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="mini-icon mini-icon-star"></span>
        <span class="text">Star</span>
      </a>
      <a class="social-count js-social-count" href="/cman8396/Community-Mod-1/stargazers">0</a>
    </li>

        <li>
          <a href="/cman8396/Community-Mod-1/fork" class="minibutton js-toggler-target fork-button lighter upwards" title="Fork this repo" rel="nofollow" data-method="post">
            <span class="mini-icon mini-icon-branch-create"></span>
            <span class="text">Fork</span>
          </a>
          <a href="/cman8396/Community-Mod-1/network" class="social-count">16</a>
        </li>


</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-icon mega-icon-repo-forked"></span>
                <span class="author vcard">
                  <a href="/cman8396" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">cman8396</span>
                  </a></span> /
                <strong><a href="/cman8396/Community-Mod-1" class="js-current-repository">Community-Mod-1</a></strong>
                  <span class="fork-flag">
                    <span class="text">forked from <a href="/sciguy1121/Community-Mod-1">sciguy1121/Community-Mod-1</a></span>
                  </span>
              </h1>
            </div>

            
  <ul class="tabs">
    <li><a href="/cman8396/Community-Mod-1" class="selected" highlight="repo_source repo_downloads repo_commits repo_tags repo_branches">Code</a></li>
    <li><a href="/cman8396/Community-Mod-1/network" highlight="repo_network">Network</a></li>
    <li><a href="/cman8396/Community-Mod-1/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>0</span></a></li>


      <li><a href="/cman8396/Community-Mod-1/wiki" highlight="repo_wiki">Wiki</a></li>


    <li><a href="/cman8396/Community-Mod-1/graphs" highlight="repo_graphs repo_contributors">Graphs</a></li>

      <li>
        <a href="/cman8396/Community-Mod-1/settings">Settings</a>
      </li>

  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/cman8396/Community-Mod-1/tags" class="tabnav-tab" highlight="repo_tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
    
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="mini-icon mini-icon-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container js-select-menu-pane">

        <div class="select-menu-modal js-select-menu-pane">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="mini-icon mini-icon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-filters">
            <div class="select-menu-text-filter">
              <input type="text" id="commitish-filter-field" class="js-select-menu-text-filter js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
            </div> <!-- /.select-menu-text-filter -->
            <div class="select-menu-tabs">
              <ul>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
                </li>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
                </li>
              </ul>
            </div><!-- /.select-menu-tabs -->
          </div><!-- /.select-menu-filters -->

          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="branches" data-filterable-for="commitish-filter-field" data-filterable-type="substring">


              <div class="select-menu-item js-navigation-item js-navigation-target selected">
                <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
                <a href="/cman8396/Community-Mod-1/blob/master/common/BlocksHelper.java" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
              </div> <!-- /.select-menu-item -->

              <form accept-charset="UTF-8" action="/cman8396/Community-Mod-1/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-navigation-target js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="2QJwCDiNKkIl21h25yts2R0LaeGLgIYW5XT/QollKM0=" /></div>


                <span class="mini-icon mini-icon-branch-create select-menu-item-icon"></span>
                <div class="select-menu-item-text">
                  <h4>Create branch: <span class="js-new-item-name"></span></h4>
                  <span class="description">from ‘master’</span>
                </div>
                <input type="hidden" name="name" id="name" class="js-new-item-submit" />
                <input type="hidden" name="branch" id="branch" value="master" />
                <input type="hidden" name="path" id="branch" value="common/BlocksHelper.java" />

              </form> <!-- /.select-menu-footer -->


          </div> <!-- /.select-menu-list -->


          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="tags" data-filterable-for="commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-no-results js-not-filterable">Nothing to show</div>

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/cman8396/Community-Mod-1" class="selected tabnav-tab" highlight="repo_source">Files</a></li>
    <li><a href="/cman8396/Community-Mod-1/commits/master" class="tabnav-tab" highlight="repo_commits">Commits</a></li>
    <li><a href="/cman8396/Community-Mod-1/branches" class="tabnav-tab" highlight="repo_branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:6a8e3f6e8fbc8119ede0f49c2451dc7f -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:6a8e3f6e8fbc8119ede0f49c2451dc7f -->


<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <div class="breadcrumb">
          <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/cman8396/Community-Mod-1" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">Community-Mod-1</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/cman8396/Community-Mod-1/tree/master/common" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">common</span></a></span><span class="separator"> / </span><strong class="final-path">BlocksHelper.java</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="common/BlocksHelper.java" data-copied-hint="copied!" title="copy to clipboard"><span class="mini-icon mini-icon-clipboard"></span></span>
        </div>

      <a href="/cman8396/Community-Mod-1/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>


        <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/cman8396/Community-Mod-1/contributors/master/common/BlocksHelper.java">
          Fetching contributors…

          <div class="participation">
            <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1334862346" width="16" /></p>
            <p class="loader-error">Cannot retrieve contributors at this time</p>
          </div>
        </div>

    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/cman8396/Community-Mod-1/blob/89649f2c6c1f11f89f02208f79730462362b54f7/common/BlocksHelper.java" data-title="Community-Mod-1/common/BlocksHelper.java at master · cman8396/Community-Mod-1 · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>127 lines (117 sloc)</span>
                <span>9.253 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                        <a class="minibutton"
                           href="/cman8396/Community-Mod-1/edit/master/common/BlocksHelper.java"
                           data-method="post" rel="nofollow" data-hotkey="e">Edit</a>
                  <a href="/cman8396/Community-Mod-1/raw/master/common/BlocksHelper.java" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/cman8396/Community-Mod-1/blame/master/common/BlocksHelper.java" class="button minibutton ">Blame</a>
                  <a href="/cman8396/Community-Mod-1/commits/master/common/BlocksHelper.java" class="button minibutton " rel="nofollow">History</a>
                </div><!-- /.button-group -->
              </div><!-- /.actions -->

            </div>
                <div class="data type-java js-blob-data">
      <table cellpadding="0" cellspacing="0" class="lines">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
</pre>
          </td>
          <td width="100%">
                  <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">communityMod</span><span class="o">.</span><span class="na">common</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">communityMod.common.blocks.BlockConcrete</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">communityMod.common.blocks.BlockIronGirder</span><span class="o">;</span></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">communityMod.common.blocks.BlockMetal</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">communityMod.common.blocks.BlockOre</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">cpw.mods.fml.common.registry.GameRegistry</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">cpw.mods.fml.common.registry.LanguageRegistry</span><span class="o">;</span></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">net.minecraft.block.Block</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">net.minecraft.block.material.Material</span><span class="o">;</span></div><div class='line' id='LC12'><span class="kn">import</span> <span class="nn">net.minecraft.creativetab.CreativeTabs</span><span class="o">;</span></div><div class='line' id='LC13'><br/></div><div class='line' id='LC14'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">BlocksHelper</span> <span class="o">{</span></div><div class='line' id='LC15'><br/></div><div class='line' id='LC16'>	<span class="c1">//Blocks</span></div><div class='line' id='LC17'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">siliconOre</span><span class="o">;</span></div><div class='line' id='LC18'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">leadOre</span><span class="o">;</span></div><div class='line' id='LC19'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">titaniumOre</span><span class="o">;</span></div><div class='line' id='LC20'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">leadBlock</span><span class="o">;</span></div><div class='line' id='LC21'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">titaniumBlock</span><span class="o">;</span></div><div class='line' id='LC22'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">copperOre</span><span class="o">;</span></div><div class='line' id='LC23'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">siliconBlock</span><span class="o">;</span></div><div class='line' id='LC24'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">ironGirder</span><span class="o">;</span></div><div class='line' id='LC25'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">concrete</span><span class="o">;</span></div><div class='line' id='LC26'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">ligniteOre</span><span class="o">;</span></div><div class='line' id='LC27'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">bituminousOre</span><span class="o">;</span></div><div class='line' id='LC28'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">anthraciteOre</span><span class="o">;</span></div><div class='line' id='LC29'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">platinumOre</span><span class="o">;</span></div><div class='line' id='LC30'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">tungstenOre</span><span class="o">;</span></div><div class='line' id='LC31'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">arsmiumOre</span><span class="o">;</span></div><div class='line' id='LC32'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">urdiumOre</span><span class="o">;</span></div><div class='line' id='LC33'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">franciumOre</span><span class="o">;</span></div><div class='line' id='LC34'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Block</span> <span class="n">franciumBlock</span><span class="o">;</span></div><div class='line' id='LC35'><br/></div><div class='line' id='LC36'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">setupBlocks</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC37'>		<span class="c1">//Block Loading</span></div><div class='line' id='LC38'><span class="o">&lt;&lt;&lt;&lt;&lt;&lt;&lt;</span> <span class="n">HEAD</span></div><div class='line' id='LC39'>		<span class="n">siliconOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">siliconOreID</span><span class="o">,</span> <span class="mi">0</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;SiliconOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC40'>		<span class="n">leadOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">leadOreID</span><span class="o">,</span> <span class="mi">1</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LeadOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC41'>		<span class="n">titaniumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">titaniumOreID</span><span class="o">,</span> <span class="mi">2</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TitaniumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span>				</div><div class='line' id='LC42'>		<span class="n">leadBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">leadBlockID</span><span class="o">,</span> <span class="mi">4</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LeadBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC43'>		<span class="n">titaniumBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">titaniumBlockID</span><span class="o">,</span> <span class="mi">3</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TitaniumBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC44'>		<span class="n">copperOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">copperOreID</span><span class="o">,</span> <span class="mi">6</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;CopperOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC45'>		<span class="n">siliconBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">siliconBlockID</span><span class="o">,</span> <span class="mi">5</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;SiliconBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC46'>		<span class="n">ironGirder</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockIronGirder</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">ironGirderID</span><span class="o">,</span> <span class="mi">8</span><span class="o">,</span> <span class="n">Material</span><span class="o">.</span><span class="na">iron</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;Iron Girder&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">2</span><span class="n">F</span><span class="o">).</span><span class="na">setStepSound</span><span class="o">(</span><span class="n">Block</span><span class="o">.</span><span class="na">soundMetalFootstep</span><span class="o">);</span></div><div class='line' id='LC47'>		<span class="n">concrete</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockConcrete</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">concreteID</span><span class="o">,</span> <span class="mi">10</span><span class="o">,</span> <span class="n">Material</span><span class="o">.</span><span class="na">iron</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;Concrete&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">2</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">17.5</span><span class="n">F</span><span class="o">).</span><span class="na">setStepSound</span><span class="o">(</span><span class="n">Block</span><span class="o">.</span><span class="na">soundStoneFootstep</span><span class="o">);</span></div><div class='line' id='LC48'>		<span class="n">ligniteOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">ligniteOreID</span><span class="o">,</span> <span class="mi">11</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LigniteOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC49'>		<span class="n">bituminousOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">bituminousOreID</span><span class="o">,</span> <span class="mi">12</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;BituminousOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC50'>		<span class="n">anthraciteOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">anthraciteOreID</span><span class="o">,</span> <span class="mi">13</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;AnthraciteOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC51'>		<span class="n">platinumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">platinumOreID</span><span class="o">,</span> <span class="mi">17</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;PlatinumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC52'>		<span class="n">tungstenOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">tungstenOreID</span><span class="o">,</span> <span class="mi">19</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TungstenOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC53'>		<span class="n">arsmiumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">arsmiumOreID</span><span class="o">,</span> <span class="mi">18</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;ArsmiumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC54'>		<span class="n">urdiumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">urdiumOreID</span><span class="o">,</span> <span class="mi">16</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;UrdiumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC55'>		<span class="n">franciumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">franciumOreID</span><span class="o">,</span> <span class="mi">14</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;FranciumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC56'>		<span class="n">franciumBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">IDsHelper</span><span class="o">.</span><span class="na">franciumBlockID</span><span class="o">,</span> <span class="mi">15</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;FranciumBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC57'><span class="o">=======</span></div><div class='line' id='LC58'>		<span class="n">siliconOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">siliconOreID</span><span class="o">,</span> <span class="mi">0</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;SiliconOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC59'>		<span class="n">leadOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">leadOreID</span><span class="o">,</span> <span class="mi">1</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LeadOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC60'>		<span class="n">titaniumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">titaniumOreID</span><span class="o">,</span> <span class="mi">2</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TitaniumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC61'>		<span class="n">leadBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">leadBlockID</span><span class="o">,</span> <span class="mi">17</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LeadBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC62'>		<span class="n">titaniumBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">titaniumBlockID</span><span class="o">,</span> <span class="mi">18</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TitaniumBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC63'>		<span class="n">copperOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">copperOreID</span><span class="o">,</span> <span class="mi">3</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;CopperOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC64'>		<span class="n">siliconBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">siliconBlockID</span><span class="o">,</span> <span class="mi">16</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">12</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;SiliconBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC65'>		<span class="n">ironGirder</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockIronGirder</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">ironGirderID</span><span class="o">,</span> <span class="mi">32</span><span class="o">,</span> <span class="n">Material</span><span class="o">.</span><span class="na">iron</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;Iron Girder&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">2</span><span class="n">F</span><span class="o">).</span><span class="na">setStepSound</span><span class="o">(</span><span class="n">Block</span><span class="o">.</span><span class="na">soundMetalFootstep</span><span class="o">);</span></div><div class='line' id='LC66'>		<span class="n">concrete</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockConcrete</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">concreteID</span><span class="o">,</span> <span class="mi">33</span><span class="o">,</span> <span class="n">Material</span><span class="o">.</span><span class="na">iron</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;Concrete&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">2</span><span class="n">F</span><span class="o">).</span><span class="na">setStepSound</span><span class="o">(</span><span class="n">Block</span><span class="o">.</span><span class="na">soundStoneFootstep</span><span class="o">);</span></div><div class='line' id='LC67'>		<span class="n">ligniteOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">ligniteOreID</span><span class="o">,</span> <span class="mi">4</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;LigniteOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC68'>		<span class="n">bituminousOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">bituminousOreID</span><span class="o">,</span> <span class="mi">5</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;BituminousOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC69'>		<span class="n">anthraciteOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">anthraciteOreID</span><span class="o">,</span> <span class="mi">6</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;AnthraciteOre&quot;</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">10</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mf">0.2</span><span class="n">F</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC70'>		<span class="n">platinumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">platinumOreID</span><span class="o">,</span> <span class="mi">9</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;PlatinumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC71'>		<span class="n">tungstenOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">tungstenOreID</span><span class="o">,</span> <span class="mi">11</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;TungstenOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC72'>		<span class="n">arsmiumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">arsmiumOreID</span><span class="o">,</span> <span class="mi">10</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;ArsmiumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC73'>		<span class="n">urdiumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">urdiumOreID</span><span class="o">,</span> <span class="mi">8</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;UrdiumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CreativeTabs</span><span class="o">.</span><span class="na">tabBlock</span><span class="o">);</span></div><div class='line' id='LC74'>		<span class="n">franciumOre</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockOre</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">franciumOreID</span><span class="o">,</span> <span class="mi">7</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;FranciumOre&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC75'>		<span class="n">franciumBlock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BlockMetal</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">franciumBlockID</span><span class="o">,</span> <span class="mi">23</span><span class="o">).</span><span class="na">setHardness</span><span class="o">(</span><span class="mi">18</span><span class="n">F</span><span class="o">).</span><span class="na">setResistance</span><span class="o">(</span><span class="mi">22</span><span class="n">F</span><span class="o">).</span><span class="na">setBlockName</span><span class="o">(</span><span class="s">&quot;FranciumBlock&quot;</span><span class="o">).</span><span class="na">setCreativeTab</span><span class="o">(</span><span class="n">CommunityMod</span><span class="o">.</span><span class="na">modTab</span><span class="o">);</span></div><div class='line' id='LC76'><span class="o">&gt;&gt;&gt;&gt;&gt;&gt;&gt;</span> <span class="n">Changed</span> <span class="n">Block</span> <span class="n">Texture</span> <span class="n">Organisation</span> <span class="o">&amp;</span> <span class="n">Ideas</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'>		<span class="n">gameRegisters</span><span class="o">();</span></div><div class='line' id='LC79'>		<span class="n">languageRegisters</span><span class="o">();</span></div><div class='line' id='LC80'>	<span class="o">}</span></div><div class='line' id='LC81'><br/></div><div class='line' id='LC82'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">gameRegisters</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC83'>		<span class="c1">//Block Registry</span></div><div class='line' id='LC84'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">siliconOre</span><span class="o">,</span> <span class="s">&quot;SiliconOre&quot;</span><span class="o">);</span></div><div class='line' id='LC85'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">leadOre</span><span class="o">,</span> <span class="s">&quot;LeadOre&quot;</span><span class="o">);</span></div><div class='line' id='LC86'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">titaniumOre</span><span class="o">,</span> <span class="s">&quot;TitaniumOre&quot;</span><span class="o">);</span></div><div class='line' id='LC87'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">leadBlock</span><span class="o">,</span> <span class="s">&quot;LeadBlock&quot;</span><span class="o">);</span></div><div class='line' id='LC88'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">titaniumBlock</span><span class="o">,</span> <span class="s">&quot;TitaniumBlock&quot;</span><span class="o">);</span></div><div class='line' id='LC89'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">copperOre</span><span class="o">,</span> <span class="s">&quot;CopperOre&quot;</span><span class="o">);</span></div><div class='line' id='LC90'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">siliconBlock</span><span class="o">,</span> <span class="s">&quot;SiliconBlock&quot;</span><span class="o">);</span></div><div class='line' id='LC91'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">ironGirder</span><span class="o">,</span> <span class="s">&quot;IronGirder&quot;</span><span class="o">);</span></div><div class='line' id='LC92'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">concrete</span><span class="o">,</span> <span class="s">&quot;Concrete&quot;</span><span class="o">);</span></div><div class='line' id='LC93'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">ligniteOre</span><span class="o">,</span> <span class="s">&quot;Lignite Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC94'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">bituminousOre</span><span class="o">,</span> <span class="s">&quot;Bituminous Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC95'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">anthraciteOre</span><span class="o">,</span> <span class="s">&quot;Anthracite Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC96'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">platinumOre</span><span class="o">,</span> <span class="s">&quot;PlatinumOre&quot;</span><span class="o">);</span></div><div class='line' id='LC97'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">tungstenOre</span><span class="o">,</span> <span class="s">&quot;tungstenOre&quot;</span><span class="o">);</span></div><div class='line' id='LC98'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">arsmiumOre</span><span class="o">,</span> <span class="s">&quot;ArsmiumOre&quot;</span><span class="o">);</span></div><div class='line' id='LC99'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">urdiumOre</span><span class="o">,</span> <span class="s">&quot;UrdiumOre&quot;</span><span class="o">);</span></div><div class='line' id='LC100'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">franciumOre</span><span class="o">,</span> <span class="s">&quot;FranciumOre&quot;</span><span class="o">);</span></div><div class='line' id='LC101'>		<span class="n">GameRegistry</span><span class="o">.</span><span class="na">registerBlock</span><span class="o">(</span><span class="n">franciumBlock</span><span class="o">,</span> <span class="s">&quot;FranciumBlock&quot;</span><span class="o">);</span></div><div class='line' id='LC102'>	<span class="o">}</span></div><div class='line' id='LC103'><br/></div><div class='line' id='LC104'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">languageRegisters</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC105'>		<span class="c1">//Blocks</span></div><div class='line' id='LC106'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">siliconOre</span><span class="o">,</span> <span class="s">&quot;Silicon Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC107'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">leadOre</span><span class="o">,</span> <span class="s">&quot;Lead Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC108'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">titaniumOre</span><span class="o">,</span> <span class="s">&quot;Titanium Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC109'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">leadBlock</span><span class="o">,</span> <span class="s">&quot;Lead Block&quot;</span><span class="o">);</span></div><div class='line' id='LC110'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">titaniumBlock</span><span class="o">,</span> <span class="s">&quot;Titanium Block&quot;</span><span class="o">);</span></div><div class='line' id='LC111'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">copperOre</span><span class="o">,</span> <span class="s">&quot;Copper Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC112'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">siliconBlock</span><span class="o">,</span> <span class="s">&quot;Silicon Block&quot;</span><span class="o">);</span></div><div class='line' id='LC113'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">ironGirder</span><span class="o">,</span> <span class="s">&quot;Iron Girder&quot;</span><span class="o">);</span></div><div class='line' id='LC114'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">concrete</span><span class="o">,</span> <span class="s">&quot;Concrete&quot;</span><span class="o">);</span></div><div class='line' id='LC115'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">ligniteOre</span><span class="o">,</span> <span class="s">&quot;Lignite Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC116'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">bituminousOre</span><span class="o">,</span> <span class="s">&quot;Bituminous Coal Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC117'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">anthraciteOre</span><span class="o">,</span> <span class="s">&quot;Anthracite Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC118'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">platinumOre</span><span class="o">,</span> <span class="s">&quot;Platinum Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC119'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">tungstenOre</span><span class="o">,</span> <span class="s">&quot;Tungsten Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC120'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">arsmiumOre</span><span class="o">,</span> <span class="s">&quot;Arsmium Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC121'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">urdiumOre</span><span class="o">,</span> <span class="s">&quot;Urdium Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC122'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">franciumOre</span><span class="o">,</span> <span class="s">&quot;Francium Ore&quot;</span><span class="o">);</span></div><div class='line' id='LC123'>		<span class="n">LanguageRegistry</span><span class="o">.</span><span class="na">addName</span><span class="o">(</span><span class="n">franciumBlock</span><span class="o">,</span> <span class="s">&quot;Francium Block&quot;</span><span class="o">);</span></div><div class='line' id='LC124'>	<span class="o">}</span></div><div class='line' id='LC125'><br/></div><div class='line' id='LC126'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>

        <a href="#jump-to-line" rel="facebox" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
        <div id="jump-to-line" style="display:none">
          <h2>Jump to Line</h2>
          <form accept-charset="UTF-8" class="js-jump-to-line-form">
            <input class="textfield js-jump-to-line-field" type="text">
            <div class="full-button">
              <button type="submit" class="button">Go</button>
            </div>
          </form>
        </div>

      </div>
    </div>
</div>

<div id="js-frame-loading-template" class="frame frame-loading large-loading-area" style="display:none;">
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543529" height="64" width="64">
</div>


        </div>
      </div>
      <div class="context-overlay"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer">
  <div class="container clearfix">

      <dl class="footer_nav">
        <dt>GitHub</dt>
        <dd><a href="https://github.com/about">About us</a></dd>
        <dd><a href="https://github.com/blog">Blog</a></dd>
        <dd><a href="https://github.com/contact">Contact &amp; support</a></dd>
        <dd><a href="http://enterprise.github.com/">GitHub Enterprise</a></dd>
        <dd><a href="http://status.github.com/">Site status</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Applications</dt>
        <dd><a href="http://mac.github.com/">GitHub for Mac</a></dd>
        <dd><a href="http://windows.github.com/">GitHub for Windows</a></dd>
        <dd><a href="http://eclipse.github.com/">GitHub for Eclipse</a></dd>
        <dd><a href="http://mobile.github.com/">GitHub mobile apps</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Services</dt>
        <dd><a href="http://get.gaug.es/">Gauges: Web analytics</a></dd>
        <dd><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></dd>
        <dd><a href="https://gist.github.com">Gist: Code snippets</a></dd>
        <dd><a href="http://jobs.github.com/">Job board</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Documentation</dt>
        <dd><a href="http://help.github.com/">GitHub Help</a></dd>
        <dd><a href="http://developer.github.com/">Developer API</a></dd>
        <dd><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></dd>
        <dd><a href="http://pages.github.com/">GitHub Pages</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>More</dt>
        <dd><a href="http://training.github.com/">Training</a></dd>
        <dd><a href="https://github.com/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="/plans">Plans &amp; pricing</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2013 <span title="0.19229s from fe13.rs.github.com">GitHub</span>, Inc. All rights reserved.</p>
    <a class="left" href="https://github.com/">
      <span class="mega-icon mega-icon-invertocat"></span>
    </a>
    <ul id="legal">
        <li><a href="https://github.com/site/terms">Terms of Service</a></li>
        <li><a href="https://github.com/site/privacy">Privacy</a></li>
        <li><a href="https://github.com/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/cman8396/Community-Mod-1/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-icon mega-icon-normalscreen"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="mini-icon mini-icon-brightness"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="mini-icon mini-icon-exclamation"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="mini-icon mini-icon-remove-close ajax-error-dismiss"></a>
    </div>

    
    
    <span id='server_response_time' data-time='0.19275' data-host='fe13'></span>
    
  </body>
</html>

