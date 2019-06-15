(function(){var k,aa="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},ba;
if("function"==typeof Object.setPrototypeOf)ba=Object.setPrototypeOf;else{var ca;a:{var da={va:!0},ea={};try{ea.__proto__=da;ca=ea.va;break a}catch(a){}ca=!1}ba=ca?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}var fa=ba;
function n(a,b){a.prototype=aa(b.prototype);a.prototype.constructor=a;if(fa)fa(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.u=b.prototype}
var ha="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){a!=Array.prototype&&a!=Object.prototype&&(a[b]=c.value)},ia="undefined"!=typeof window&&window===this?this:"undefined"!=typeof global&&null!=global?global:this;
function ja(a,b){if(b){for(var c=ia,d=a.split("."),e=0;e<d.length-1;e++){var f=d[e];f in c||(c[f]={});c=c[f]}d=d[d.length-1];e=c[d];f=b(e);f!=e&&null!=f&&ha(c,d,{configurable:!0,writable:!0,value:f})}}
var ka="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)Object.prototype.hasOwnProperty.call(d,e)&&(a[e]=d[e])}return a};
ja("Object.assign",function(a){return a||ka});
ja("Object.is",function(a){return a?a:function(a,c){return a===c?0!==a||1/a===1/c:a!==a&&c!==c}});
ja("String.prototype.includes",function(a){return a?a:function(a,c){if(null==this)throw new TypeError("The 'this' value for String.prototype.includes must not be null or undefined");if(a instanceof RegExp)throw new TypeError("First argument to String.prototype.includes must not be a regular expression");return-1!==(this+"").indexOf(a,c||0)}});
(function(){function a(){function a(){}
Reflect.construct(a,[],function(){});
return new a instanceof a}
if("undefined"!=typeof Reflect&&Reflect.construct){if(a())return Reflect.construct;var b=Reflect.construct;return function(a,d,e){a=b(a,d);e&&Reflect.setPrototypeOf(a,e.prototype);return a}}return function(a,b,e){void 0===e&&(e=a);
e=aa(e.prototype||Object.prototype);return Function.prototype.apply.call(a,e,b)||e}})();
var p=this;function q(a){return void 0!==a}
function r(a){return"string"==typeof a}
function la(a){return"boolean"==typeof a}
function ma(a){return"number"==typeof a}
function u(a,b,c){a=a.split(".");c=c||p;a[0]in c||"undefined"==typeof c.execScript||c.execScript("var "+a[0]);for(var d;a.length&&(d=a.shift());)!a.length&&q(b)?c[d]=b:c[d]&&c[d]!==Object.prototype[d]?c=c[d]:c=c[d]={}}
var na=/^[\w+/_-]+[=]{0,2}$/,oa=null;function v(a,b){for(var c=a.split("."),d=b||p,e=0;e<c.length;e++)if(d=d[c[e]],null==d)return null;return d}
function pa(){}
function qa(a){a.fa=void 0;a.getInstance=function(){return a.fa?a.fa:a.fa=new a}}
function ra(a){var b=typeof a;if("object"==b)if(a){if(a instanceof Array)return"array";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if("[object Window]"==c)return"object";if("[object Array]"==c||"number"==typeof a.length&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("splice"))return"array";if("[object Function]"==c||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("call"))return"function"}else return"null";
else if("function"==b&&"undefined"==typeof a.call)return"object";return b}
function w(a){return"array"==ra(a)}
function sa(a){var b=ra(a);return"array"==b||"object"==b&&"number"==typeof a.length}
function ta(a){return"function"==ra(a)}
function ua(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
var wa="closure_uid_"+(1E9*Math.random()>>>0),xa=0;function ya(a,b,c){return a.call.apply(a.bind,arguments)}
function za(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var c=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arguments)}}
function x(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?x=ya:x=za;return x.apply(null,arguments)}
function y(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}
var z=Date.now||function(){return+new Date};
function Aa(a,b){u(a,b,void 0)}
function A(a,b){function c(){}
c.prototype=b.prototype;a.u=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.pb=function(a,c,f){for(var d=Array(arguments.length-2),e=2;e<arguments.length;e++)d[e-2]=arguments[e];return b.prototype[c].apply(a,d)}}
;var Ba=document,B=window;function C(a){if(Error.captureStackTrace)Error.captureStackTrace(this,C);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}
A(C,Error);C.prototype.name="CustomError";var Ca=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if(r(a))return r(b)&&1==b.length?a.indexOf(b,0):-1;
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},D=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=r(a)?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},Da=Array.prototype.filter?function(a,b){return Array.prototype.filter.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=[],e=0,f=r(a)?a.split(""):a,g=0;g<c;g++)if(g in f){var h=f[g];
b.call(void 0,h,g,a)&&(d[e++]=h)}return d},Ea=Array.prototype.map?function(a,b){return Array.prototype.map.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=Array(c),e=r(a)?a.split(""):a,f=0;f<c;f++)f in e&&(d[f]=b.call(void 0,e[f],f,a));
return d};
function Fa(a,b){a:{var c=a.length;for(var d=r(a)?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?null:r(a)?a.charAt(c):a[c]}
function Ga(a,b){var c=Ca(a,b);0<=c&&Array.prototype.splice.call(a,c,1)}
function Ja(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return c}return[]}
function Ka(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(sa(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
;var La=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]};
function Ma(a){if(!Na.test(a))return a;-1!=a.indexOf("&")&&(a=a.replace(Oa,"&amp;"));-1!=a.indexOf("<")&&(a=a.replace(Pa,"&lt;"));-1!=a.indexOf(">")&&(a=a.replace(Qa,"&gt;"));-1!=a.indexOf('"')&&(a=a.replace(Ra,"&quot;"));-1!=a.indexOf("'")&&(a=a.replace(Sa,"&#39;"));-1!=a.indexOf("\x00")&&(a=a.replace(Ta,"&#0;"));return a}
var Oa=/&/g,Pa=/</g,Qa=/>/g,Ra=/"/g,Sa=/'/g,Ta=/\x00/g,Na=/[\x00&<>"']/;function Ua(a){for(var b=0,c=0;c<a.length;++c)b=31*b+a.charCodeAt(c)>>>0;return b}
;var Va;a:{var Wa=p.navigator;if(Wa){var Xa=Wa.userAgent;if(Xa){Va=Xa;break a}}Va=""}function E(a){return-1!=Va.indexOf(a)}
;function Ya(a,b){for(var c in a)b.call(void 0,a[c],c,a)}
function $a(a,b){var c=sa(b),d=c?b:arguments;for(c=c?0:1;c<d.length;c++){if(null==a)return;a=a[d[c]]}return a}
function ab(a){var b=bb,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
function cb(a){for(var b in a)return!1;return!0}
function db(a,b){if(null!==a&&b in a)throw Error('The object already contains the key "'+b+'"');a[b]=!0}
function eb(a,b){for(var c in a)if(!(c in b)||a[c]!==b[c])return!1;for(c in b)if(!(c in a))return!1;return!0}
function fb(a){var b={},c;for(c in a)b[c]=a[c];return b}
var gb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function hb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<gb.length;f++)c=gb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;function ib(a){ib[" "](a);return a}
ib[" "]=pa;var jb=E("Opera"),kb=E("Trident")||E("MSIE"),lb=E("Edge"),mb=E("Gecko")&&!(-1!=Va.toLowerCase().indexOf("webkit")&&!E("Edge"))&&!(E("Trident")||E("MSIE"))&&!E("Edge"),nb=-1!=Va.toLowerCase().indexOf("webkit")&&!E("Edge");function ob(){var a=p.document;return a?a.documentMode:void 0}
var pb;a:{var qb="",rb=function(){var a=Va;if(mb)return/rv:([^\);]+)(\)|;)/.exec(a);if(lb)return/Edge\/([\d\.]+)/.exec(a);if(kb)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(nb)return/WebKit\/(\S+)/.exec(a);if(jb)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
rb&&(qb=rb?rb[1]:"");if(kb){var sb=ob();if(null!=sb&&sb>parseFloat(qb)){pb=String(sb);break a}}pb=qb}var tb=pb,ub;var vb=p.document;ub=vb&&kb?ob()||("CSS1Compat"==vb.compatMode?parseInt(tb,10):5):void 0;var wb=null,xb=null;function yb(a){this.b=a||{cookie:""}}
k=yb.prototype;k.isEnabled=function(){return navigator.cookieEnabled};
k.set=function(a,b,c,d,e,f){if(/[;=\s]/.test(a))throw Error('Invalid cookie name "'+a+'"');if(/[;\r\n]/.test(b))throw Error('Invalid cookie value "'+b+'"');q(c)||(c=-1);e=e?";domain="+e:"";d=d?";path="+d:"";f=f?";secure":"";c=0>c?"":0==c?";expires="+(new Date(1970,1,1)).toUTCString():";expires="+(new Date(z()+1E3*c)).toUTCString();this.b.cookie=a+"="+b+e+d+c+f};
k.get=function(a,b){for(var c=a+"=",d=(this.b.cookie||"").split(";"),e=0,f;e<d.length;e++){f=La(d[e]);if(0==f.lastIndexOf(c,0))return f.substr(c.length);if(f==a)return""}return b};
k.remove=function(a,b,c){var d=q(this.get(a));this.set(a,"",0,b,c);return d};
k.isEmpty=function(){return!this.b.cookie};
k.clear=function(){for(var a=(this.b.cookie||"").split(";"),b=[],c=[],d,e,f=0;f<a.length;f++)e=La(a[f]),d=e.indexOf("="),-1==d?(b.push(""),c.push(e)):(b.push(e.substring(0,d)),c.push(e.substring(d+1)));for(a=b.length-1;0<=a;a--)this.remove(b[a])};
var zb=new yb("undefined"==typeof document?null:document);zb.f=3950;function Ab(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}
;var Bb=!kb||9<=Number(ub);function Cb(){this.b="";this.f=Db}
Cb.prototype.I=!0;Cb.prototype.H=function(){return this.b};
Cb.prototype.ea=!0;Cb.prototype.aa=function(){return 1};
function Eb(a){return a instanceof Cb&&a.constructor===Cb&&a.f===Db?a.b:"type_error:TrustedResourceUrl"}
var Db={};function F(){this.b="";this.f=Fb}
F.prototype.I=!0;F.prototype.H=function(){return this.b};
F.prototype.ea=!0;F.prototype.aa=function(){return 1};
function Gb(a){return a instanceof F&&a.constructor===F&&a.f===Fb?a.b:"type_error:SafeUrl"}
var Hb=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i;function Ib(a){if(a instanceof F)return a;a=a.I?a.H():String(a);Hb.test(a)||(a="about:invalid#zClosurez");return Jb(a)}
var Fb={};function Jb(a){var b=new F;b.b=a;return b}
Jb("about:blank");function Kb(){this.b="";this.g=Lb;this.f=null}
Kb.prototype.ea=!0;Kb.prototype.aa=function(){return this.f};
Kb.prototype.I=!0;Kb.prototype.H=function(){return this.b};
var Lb={};function Mb(a,b){var c=new Kb;c.b=a;c.f=b;return c}
Mb("<!DOCTYPE html>",0);Mb("",0);Mb("<br>",0);function Nb(a,b){var c=b instanceof F?b:Ib(b);a.href=Gb(c)}
function Ob(a,b,c){a.rel=c;a.href=-1!=c.toLowerCase().indexOf("stylesheet")?Eb(b):b instanceof Cb?Eb(b):b instanceof F?Gb(b):Ib(b).H()}
function Pb(a,b){a.src=Eb(b);var c;if(null===oa){a:{if((c=p.document.querySelector("script[nonce]"))&&(c=c.nonce||c.getAttribute("nonce"))&&na.test(c))break a;c=null}oa=c||""}(c=oa)&&a.setAttribute("nonce",c)}
;function Qb(a,b){this.x=q(a)?a:0;this.y=q(b)?b:0}
k=Qb.prototype;k.clone=function(){return new Qb(this.x,this.y)};
k.equals=function(a){return a instanceof Qb&&(this==a?!0:this&&a?this.x==a.x&&this.y==a.y:!1)};
k.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};
k.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);return this};
k.round=function(){this.x=Math.round(this.x);this.y=Math.round(this.y);return this};function Rb(a,b){this.width=a;this.height=b}
k=Rb.prototype;k.clone=function(){return new Rb(this.width,this.height)};
k.aspectRatio=function(){return this.width/this.height};
k.isEmpty=function(){return!(this.width*this.height)};
k.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
k.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
k.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};function Sb(a){var b=document;return r(a)?b.getElementById(a):a}
function Tb(a,b){Ya(b,function(b,d){b&&b.I&&(b=b.H());"style"==d?a.style.cssText=b:"class"==d?a.className=b:"for"==d?a.htmlFor=b:Ub.hasOwnProperty(d)?a.setAttribute(Ub[d],b):0==d.lastIndexOf("aria-",0)||0==d.lastIndexOf("data-",0)?a.setAttribute(d,b):a[d]=b})}
var Ub={cellpadding:"cellPadding",cellspacing:"cellSpacing",colspan:"colSpan",frameborder:"frameBorder",height:"height",maxlength:"maxLength",nonce:"nonce",role:"role",rowspan:"rowSpan",type:"type",usemap:"useMap",valign:"vAlign",width:"width"};
function Vb(a,b,c){var d=arguments,e=document,f=String(d[0]),g=d[1];if(!Bb&&g&&(g.name||g.type)){f=["<",f];g.name&&f.push(' name="',Ma(g.name),'"');if(g.type){f.push(' type="',Ma(g.type),'"');var h={};hb(h,g);delete h.type;g=h}f.push(">");f=f.join("")}f=e.createElement(f);g&&(r(g)?f.className=g:w(g)?f.className=g.join(" "):Tb(f,g));2<d.length&&Wb(e,f,d);return f}
function Wb(a,b,c){function d(c){c&&b.appendChild(r(c)?a.createTextNode(c):c)}
for(var e=2;e<c.length;e++){var f=c[e];if(!sa(f)||ua(f)&&0<f.nodeType)d(f);else{a:{if(f&&"number"==typeof f.length){if(ua(f)){var g="function"==typeof f.item||"string"==typeof f.item;break a}if(ta(f)){g="function"==typeof f.item;break a}}g=!1}D(g?Ja(f):f,d)}}}
function Xb(a,b){for(var c=0;a;){if(b(a))return a;a=a.parentNode;c++}return null}
;function Yb(a){Zb();var b=new Cb;b.b=a;return b}
var Zb=pa;var $b=/^[\w+/_-]+[=]{0,2}$/;function ac(){var a=p.document.querySelector("script[nonce]");if(a&&(a=a.nonce||a.getAttribute("nonce"))&&$b.test(a))return a}
;function bc(){var a=cc;try{var b;if(b=!!a&&null!=a.location.href)a:{try{ib(a.foo);b=!0;break a}catch(c){}b=!1}return b}catch(c){return!1}}
function dc(a){var b=ec;if(b)for(var c in b)Object.prototype.hasOwnProperty.call(b,c)&&a.call(void 0,b[c],c,b)}
function fc(){var a=[];dc(function(b){a.push(b)});
return a}
var ec={cb:"allow-forms",eb:"allow-modals",fb:"allow-orientation-lock",gb:"allow-pointer-lock",hb:"allow-popups",ib:"allow-popups-to-escape-sandbox",jb:"allow-presentation",kb:"allow-same-origin",lb:"allow-scripts",mb:"allow-top-navigation",nb:"allow-top-navigation-by-user-activation"},gc=Ab(function(){return fc()});
function hc(){var a=document.createElement("IFRAME").sandbox,b=a&&a.supports;if(!b)return{};var c={};D(gc(),function(d){b.call(a,d)&&(c[d]=!0)});
return c}
;function ic(a,b,c){a.addEventListener?a.addEventListener(b,c,void 0):a.attachEvent&&a.attachEvent("on"+b,c)}
function jc(a,b,c){a.removeEventListener?a.removeEventListener(b,c,void 0):a.detachEvent&&a.detachEvent("on"+b,c)}
;function kc(a){var b=!1,c=!1;c=void 0===c?!1:c;b=void 0===b?!1:b;p.google_image_requests||(p.google_image_requests=[]);var d=p.document.createElement("img");if(b){var e=function(){b&&Ga(p.google_image_requests,d);jc(d,"load",e);jc(d,"error",e)};
ic(d,"load",e);ic(d,"error",e)}c&&(d.referrerPolicy="no-referrer");d.src=a;p.google_image_requests.push(d)}
;function lc(a){"number"==typeof a&&(a=Math.round(a)+"px");return a}
;var mc=!!window.google_async_iframe_id,cc=mc&&window.parent||window;var nc=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^/?#]*)@)?([^/#?]*?)(?::([0-9]+))?(?=[/#?]|$))?([^?#]+)?(?:\?([^#]*))?(?:#([\s\S]*))?$/;function G(a){return a.match(nc)}
function oc(a){return a?decodeURI(a):a}
function pc(a,b,c){if(w(b))for(var d=0;d<b.length;d++)pc(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function qc(a){var b=[],c;for(c in a)pc(c,a[c],b);return b.join("&")}
function rc(a,b){var c=qc(b);if(c){var d=a.indexOf("#");0>d&&(d=a.length);var e=a.indexOf("?");if(0>e||e>d){e=d;var f=""}else f=a.substring(e+1,d);d=[a.substr(0,e),f,a.substr(d)];e=d[1];d[1]=c?e?e+"&"+c:c:e;c=d[0]+(d[1]?"?"+d[1]:"")+d[2]}else c=a;return c}
;var sc=null;function tc(){var a=p.performance;return a&&a.now&&a.timing?Math.floor(a.now()+a.timing.navigationStart):z()}
function uc(){var a=void 0===a?p:a;return(a=a.performance)&&a.now?a.now():null}
;function vc(a,b,c){this.label=a;this.type=b;this.value=c;this.duration=0;this.uniqueId=this.label+"_"+this.type+"_"+Math.random();this.slotId=void 0}
;var H=p.performance,wc=!!(H&&H.mark&&H.measure&&H.clearMarks),xc=Ab(function(){var a;if(a=wc){var b;if(null===sc){sc="";try{a="";try{a=p.top.location.hash}catch(c){a=p.location.hash}a&&(sc=(b=a.match(/\bdeid=([\d,]+)/))?b[1]:"")}catch(c){}}b=sc;a=!!b.indexOf&&0<=b.indexOf("1337")}return a});
function yc(){var a=zc;this.events=[];this.f=a||p;var b=null;a&&(a.google_js_reporting_queue=a.google_js_reporting_queue||[],this.events=a.google_js_reporting_queue,b=a.google_measure_js_timing);this.b=xc()||(null!=b?b:1>Math.random())}
yc.prototype.disable=function(){this.b=!1;this.events!=this.f.google_js_reporting_queue&&(xc()&&D(this.events,Ac),this.events.length=0)};
function Ac(a){a&&H&&xc()&&(H.clearMarks("goog_"+a.uniqueId+"_start"),H.clearMarks("goog_"+a.uniqueId+"_end"))}
yc.prototype.start=function(a,b){if(!this.b)return null;var c=uc()||tc();c=new vc(a,b,c);var d="goog_"+c.uniqueId+"_start";H&&xc()&&H.mark(d);return c};
yc.prototype.end=function(a){if(this.b&&ma(a.value)){var b=uc()||tc();a.duration=b-a.value;b="goog_"+a.uniqueId+"_end";H&&xc()&&H.mark(b);this.b&&this.events.push(a)}};if(mc&&!bc()){var Bc="."+Ba.domain;try{for(;2<Bc.split(".").length&&!bc();)Ba.domain=Bc=Bc.substr(Bc.indexOf(".")+1),cc=window.parent}catch(a){}bc()||(cc=window)}var zc=cc,Cc=new yc;"complete"==zc.document.readyState?zc.google_measure_js_timing||Cc.disable():Cc.b&&ic(zc,"load",function(){zc.google_measure_js_timing||Cc.disable()});var Dc=(new Date).getTime();function Ec(a){if(!a)return"";a=a.split("#")[0].split("?")[0];a=a.toLowerCase();0==a.indexOf("//")&&(a=window.location.protocol+a);/^[\w\-]*:\/\//.test(a)||(a=window.location.href);var b=a.substring(a.indexOf("://")+3),c=b.indexOf("/");-1!=c&&(b=b.substring(0,c));a=a.substring(0,a.indexOf("://"));if("http"!==a&&"https"!==a&&"chrome-extension"!==a&&"file"!==a&&"android-app"!==a&&"chrome-search"!==a&&"app"!==a)throw Error("Invalid URI scheme in origin: "+a);c="";var d=b.indexOf(":");if(-1!=d){var e=
b.substring(d+1);b=b.substring(0,d);if("http"===a&&"80"!==e||"https"===a&&"443"!==e)c=":"+e}return a+"://"+b+c}
;function Fc(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;e[4]=3285377520;t=m=0}
function b(a){for(var b=g,c=0;64>c;c+=4)b[c/4]=a[c]<<24|a[c+1]<<16|a[c+2]<<8|a[c+3];for(c=16;80>c;c++)a=b[c-3]^b[c-8]^b[c-14]^b[c-16],b[c]=(a<<1|a>>>31)&4294967295;a=e[0];var d=e[1],f=e[2],h=e[3],l=e[4];for(c=0;80>c;c++){if(40>c)if(20>c){var m=h^d&(f^h);var t=1518500249}else m=d^f^h,t=1859775393;else 60>c?(m=d&f|h&(d|f),t=2400959708):(m=d^f^h,t=3395469782);m=((a<<5|a>>>27)&4294967295)+m+l+t+b[c]&4294967295;l=h;h=f;f=(d<<30|d>>>2)&4294967295;d=a;a=m}e[0]=e[0]+a&4294967295;e[1]=e[1]+d&4294967295;e[2]=
e[2]+f&4294967295;e[3]=e[3]+h&4294967295;e[4]=e[4]+l&4294967295}
function c(a,c){if("string"===typeof a){a=unescape(encodeURIComponent(a));for(var d=[],e=0,g=a.length;e<g;++e)d.push(a.charCodeAt(e));a=d}c||(c=a.length);d=0;if(0==m)for(;d+64<c;)b(a.slice(d,d+64)),d+=64,t+=64;for(;d<c;)if(f[m++]=a[d++],t++,64==m)for(m=0,b(f);d+64<c;)b(a.slice(d,d+64)),d+=64,t+=64}
function d(){var a=[],d=8*t;56>m?c(h,56-m):c(h,64-(m-56));for(var g=63;56<=g;g--)f[g]=d&255,d>>>=8;b(f);for(g=d=0;5>g;g++)for(var l=24;0<=l;l-=8)a[d++]=e[g]>>l&255;return a}
for(var e=[],f=[],g=[],h=[128],l=1;64>l;++l)h[l]=0;var m,t;a();return{reset:a,update:c,digest:d,xa:function(){for(var a=d(),b="",c=0;c<a.length;c++)b+="0123456789ABCDEF".charAt(Math.floor(a[c]/16))+"0123456789ABCDEF".charAt(a[c]%16);return b}}}
;function Gc(a,b,c){var d=[],e=[];if(1==(w(c)?2:1))return e=[b,a],D(d,function(a){e.push(a)}),Hc(e.join(" "));
var f=[],g=[];D(c,function(a){g.push(a.key);f.push(a.value)});
c=Math.floor((new Date).getTime()/1E3);e=0==f.length?[c,b,a]:[f.join(":"),c,b,a];D(d,function(a){e.push(a)});
a=Hc(e.join(" "));a=[c,a];0==g.length||a.push(g.join(""));return a.join("_")}
function Hc(a){var b=Fc();b.update(a);return b.xa().toLowerCase()}
;function Ic(a){var b=Ec(String(p.location.href)),c=p.__OVERRIDE_SID;null==c&&(c=(new yb(document)).get("SID"));if(c&&(b=(c=0==b.indexOf("https:")||0==b.indexOf("chrome-extension:"))?p.__SAPISID:p.__APISID,null==b&&(b=(new yb(document)).get(c?"SAPISID":"APISID")),b)){c=c?"SAPISIDHASH":"APISIDHASH";var d=String(p.location.href);return d&&b&&c?[c,Gc(Ec(d),b,a||null)].join(" "):null}return null}
;function Jc(a,b){this.g=a;this.h=b;this.f=0;this.b=null}
Jc.prototype.get=function(){if(0<this.f){this.f--;var a=this.b;this.b=a.next;a.next=null}else a=this.g();return a};
function Kc(a,b){a.h(b);100>a.f&&(a.f++,b.next=a.b,a.b=b)}
;function Lc(a){p.setTimeout(function(){throw a;},0)}
var Mc;
function Nc(){var a=p.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!E("Presto")&&(a=function(){var a=document.createElement("IFRAME");a.style.display="none";a.src="";document.documentElement.appendChild(a);var b=a.contentWindow;a=b.document;a.open();a.write("");a.close();var c="callImmediate"+Math.random(),d="file:"==b.location.protocol?"*":b.location.protocol+"//"+b.location.host;a=x(function(a){if(("*"==d||a.origin==d)&&a.data==
c)this.port1.onmessage()},this);
b.addEventListener("message",a,!1);this.port1={};this.port2={postMessage:function(){b.postMessage(c,d)}}});
if("undefined"!==typeof a&&!E("Trident")&&!E("MSIE")){var b=new a,c={},d=c;b.port1.onmessage=function(){if(q(c.next)){c=c.next;var a=c.la;c.la=null;a()}};
return function(a){d.next={la:a};d=d.next;b.port2.postMessage(0)}}return"undefined"!==typeof document&&"onreadystatechange"in document.createElement("SCRIPT")?function(a){var b=document.createElement("SCRIPT");
b.onreadystatechange=function(){b.onreadystatechange=null;b.parentNode.removeChild(b);b=null;a();a=null};
document.documentElement.appendChild(b)}:function(a){p.setTimeout(a,0)}}
;function Oc(){this.f=this.b=null}
var Qc=new Jc(function(){return new Pc},function(a){a.reset()});
Oc.prototype.add=function(a,b){var c=Qc.get();c.set(a,b);this.f?this.f.next=c:this.b=c;this.f=c};
Oc.prototype.remove=function(){var a=null;this.b&&(a=this.b,this.b=this.b.next,this.b||(this.f=null),a.next=null);return a};
function Pc(){this.next=this.scope=this.b=null}
Pc.prototype.set=function(a,b){this.b=a;this.scope=b;this.next=null};
Pc.prototype.reset=function(){this.next=this.scope=this.b=null};function Rc(a,b){Sc||Tc();Uc||(Sc(),Uc=!0);Vc.add(a,b)}
var Sc;function Tc(){if(p.Promise&&p.Promise.resolve){var a=p.Promise.resolve(void 0);Sc=function(){a.then(Wc)}}else Sc=function(){var a=Wc;
!ta(p.setImmediate)||p.Window&&p.Window.prototype&&!E("Edge")&&p.Window.prototype.setImmediate==p.setImmediate?(Mc||(Mc=Nc()),Mc(a)):p.setImmediate(a)}}
var Uc=!1,Vc=new Oc;function Wc(){for(var a;a=Vc.remove();){try{a.b.call(a.scope)}catch(b){Lc(b)}Kc(Qc,a)}Uc=!1}
;function Xc(){this.f=-1}
;function Yc(){this.f=64;this.b=[];this.j=[];this.l=[];this.h=[];this.h[0]=128;for(var a=1;a<this.f;++a)this.h[a]=0;this.i=this.g=0;this.reset()}
A(Yc,Xc);Yc.prototype.reset=function(){this.b[0]=1732584193;this.b[1]=4023233417;this.b[2]=2562383102;this.b[3]=271733878;this.b[4]=3285377520;this.i=this.g=0};
function Zc(a,b,c){c||(c=0);var d=a.l;if(r(b))for(var e=0;16>e;e++)d[e]=b.charCodeAt(c)<<24|b.charCodeAt(c+1)<<16|b.charCodeAt(c+2)<<8|b.charCodeAt(c+3),c+=4;else for(e=0;16>e;e++)d[e]=b[c]<<24|b[c+1]<<16|b[c+2]<<8|b[c+3],c+=4;for(e=16;80>e;e++){var f=d[e-3]^d[e-8]^d[e-14]^d[e-16];d[e]=(f<<1|f>>>31)&4294967295}b=a.b[0];c=a.b[1];var g=a.b[2],h=a.b[3],l=a.b[4];for(e=0;80>e;e++){if(40>e)if(20>e){f=h^c&(g^h);var m=1518500249}else f=c^g^h,m=1859775393;else 60>e?(f=c&g|h&(c|g),m=2400959708):(f=c^g^h,m=
3395469782);f=(b<<5|b>>>27)+f+l+m+d[e]&4294967295;l=h;h=g;g=(c<<30|c>>>2)&4294967295;c=b;b=f}a.b[0]=a.b[0]+b&4294967295;a.b[1]=a.b[1]+c&4294967295;a.b[2]=a.b[2]+g&4294967295;a.b[3]=a.b[3]+h&4294967295;a.b[4]=a.b[4]+l&4294967295}
Yc.prototype.update=function(a,b){if(null!=a){q(b)||(b=a.length);for(var c=b-this.f,d=0,e=this.j,f=this.g;d<b;){if(0==f)for(;d<=c;)Zc(this,a,d),d+=this.f;if(r(a))for(;d<b;){if(e[f]=a.charCodeAt(d),++f,++d,f==this.f){Zc(this,e);f=0;break}}else for(;d<b;)if(e[f]=a[d],++f,++d,f==this.f){Zc(this,e);f=0;break}}this.g=f;this.i+=b}};
Yc.prototype.digest=function(){var a=[],b=8*this.i;56>this.g?this.update(this.h,56-this.g):this.update(this.h,this.f-(this.g-56));for(var c=this.f-1;56<=c;c--)this.j[c]=b&255,b/=256;Zc(this,this.j);for(c=b=0;5>c;c++)for(var d=24;0<=d;d-=8)a[b]=this.b[c]>>d&255,++b;return a};function I(){this.g=this.g;this.B=this.B}
I.prototype.g=!1;I.prototype.dispose=function(){this.g||(this.g=!0,this.m())};
function $c(a,b){a.g?q(void 0)?b.call(void 0):b():(a.B||(a.B=[]),a.B.push(q(void 0)?x(b,void 0):b))}
I.prototype.m=function(){if(this.B)for(;this.B.length;)this.B.shift()()};
function ad(a){a&&"function"==typeof a.dispose&&a.dispose()}
function bd(a){for(var b=0,c=arguments.length;b<c;++b){var d=arguments[b];sa(d)?bd.apply(null,d):ad(d)}}
;function cd(a){if(a.classList)return a.classList;a=a.className;return r(a)&&a.match(/\S+/g)||[]}
function dd(a,b){if(a.classList)var c=a.classList.contains(b);else c=cd(a),c=0<=Ca(c,b);return c}
function ed(){var a=document.body;a.classList?a.classList.remove("inverted-hdpi"):dd(a,"inverted-hdpi")&&(a.className=Da(cd(a),function(a){return"inverted-hdpi"!=a}).join(" "))}
;var fd="StopIteration"in p?p.StopIteration:{message:"StopIteration",stack:""};function gd(){}
gd.prototype.next=function(){throw fd;};
gd.prototype.D=function(){return this};
function hd(a){if(a instanceof gd)return a;if("function"==typeof a.D)return a.D(!1);if(sa(a)){var b=0,c=new gd;c.next=function(){for(;;){if(b>=a.length)throw fd;if(b in a)return a[b++];b++}};
return c}throw Error("Not implemented");}
function id(a,b){if(sa(a))try{D(a,b,void 0)}catch(c){if(c!==fd)throw c;}else{a=hd(a);try{for(;;)b.call(void 0,a.next(),void 0,a)}catch(c){if(c!==fd)throw c;}}}
function jd(a){if(sa(a))return Ja(a);a=hd(a);var b=[];id(a,function(a){b.push(a)});
return b}
;function kd(a,b){this.g={};this.b=[];this.h=this.f=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof kd)for(c=ld(a),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])}
function ld(a){md(a);return a.b.concat()}
k=kd.prototype;k.equals=function(a,b){if(this===a)return!0;if(this.f!=a.f)return!1;var c=b||nd;md(this);for(var d,e=0;d=this.b[e];e++)if(!c(this.get(d),a.get(d)))return!1;return!0};
function nd(a,b){return a===b}
k.isEmpty=function(){return 0==this.f};
k.clear=function(){this.g={};this.h=this.f=this.b.length=0};
k.remove=function(a){return Object.prototype.hasOwnProperty.call(this.g,a)?(delete this.g[a],this.f--,this.h++,this.b.length>2*this.f&&md(this),!0):!1};
function md(a){if(a.f!=a.b.length){for(var b=0,c=0;b<a.b.length;){var d=a.b[b];Object.prototype.hasOwnProperty.call(a.g,d)&&(a.b[c++]=d);b++}a.b.length=c}if(a.f!=a.b.length){var e={};for(c=b=0;b<a.b.length;)d=a.b[b],Object.prototype.hasOwnProperty.call(e,d)||(a.b[c++]=d,e[d]=1),b++;a.b.length=c}}
k.get=function(a,b){return Object.prototype.hasOwnProperty.call(this.g,a)?this.g[a]:b};
k.set=function(a,b){Object.prototype.hasOwnProperty.call(this.g,a)||(this.f++,this.b.push(a),this.h++);this.g[a]=b};
k.forEach=function(a,b){for(var c=ld(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};
k.clone=function(){return new kd(this)};
k.D=function(a){md(this);var b=0,c=this.h,d=this,e=new gd;e.next=function(){if(c!=d.h)throw Error("The map has changed since the iterator was created");if(b>=d.b.length)throw fd;var e=d.b[b++];return a?e:d.g[e]};
return e};function od(a){var b=[];pd(new qd,a,b);return b.join("")}
function qd(){}
function pd(a,b,c){if(null==b)c.push("null");else{if("object"==typeof b){if(w(b)){var d=b;b=d.length;c.push("[");for(var e="",f=0;f<b;f++)c.push(e),pd(a,d[f],c),e=",";c.push("]");return}if(b instanceof String||b instanceof Number||b instanceof Boolean)b=b.valueOf();else{c.push("{");e="";for(d in b)Object.prototype.hasOwnProperty.call(b,d)&&(f=b[d],"function"!=typeof f&&(c.push(e),rd(d,c),c.push(":"),pd(a,f,c),e=","));c.push("}");return}}switch(typeof b){case "string":rd(b,c);break;case "number":c.push(isFinite(b)&&
!isNaN(b)?String(b):"null");break;case "boolean":c.push(String(b));break;case "function":c.push("null");break;default:throw Error("Unknown type: "+typeof b);}}}
var sd={'"':'\\"',"\\":"\\\\","/":"\\/","\b":"\\b","\f":"\\f","\n":"\\n","\r":"\\r","\t":"\\t","\x0B":"\\u000b"},td=/\uffff/.test("\uffff")?/[\\"\x00-\x1f\x7f-\uffff]/g:/[\\"\x00-\x1f\x7f-\xff]/g;function rd(a,b){b.push('"',a.replace(td,function(a){var b=sd[a];b||(b="\\u"+(a.charCodeAt(0)|65536).toString(16).substr(1),sd[a]=b);return b}),'"')}
;function ud(a){a.prototype.then=a.prototype.then;a.prototype.$goog_Thenable=!0}
function vd(a){if(!a)return!1;try{return!!a.$goog_Thenable}catch(b){return!1}}
;function J(a,b){this.b=0;this.l=void 0;this.h=this.f=this.g=null;this.i=this.j=!1;if(a!=pa)try{var c=this;a.call(b,function(a){wd(c,2,a)},function(a){wd(c,3,a)})}catch(d){wd(this,3,d)}}
function xd(){this.next=this.context=this.onRejected=this.g=this.b=null;this.f=!1}
xd.prototype.reset=function(){this.context=this.onRejected=this.g=this.b=null;this.f=!1};
var yd=new Jc(function(){return new xd},function(a){a.reset()});
function zd(a,b,c){var d=yd.get();d.g=a;d.onRejected=b;d.context=c;return d}
function Ad(a){return new J(function(b,c){c(a)})}
function Bd(a,b,c){Cd(a,b,c,null)||Rc(y(b,a))}
function Dd(a){return new J(function(b,c){a.length||b(void 0);for(var d=0,e;d<a.length;d++)e=a[d],Bd(e,b,c)})}
function Ed(a){return new J(function(b){var c=a.length,d=[];if(c)for(var e=function(a,e,f){c--;d[a]=e?{Z:!0,value:f}:{Z:!1,reason:f};0==c&&b(d)},f=0,g;f<a.length;f++)g=a[f],Bd(g,y(e,f,!0),y(e,f,!1));
else b(d)})}
J.prototype.then=function(a,b,c){return Fd(this,ta(a)?a:null,ta(b)?b:null,c)};
ud(J);function Gd(a,b){var c=zd(b,b,void 0);c.f=!0;Hd(a,c);return a}
function Id(a,b){return Fd(a,null,b,void 0)}
J.prototype.cancel=function(a){0==this.b&&Rc(function(){var b=new Jd(a);Kd(this,b)},this)};
function Kd(a,b){if(0==a.b)if(a.g){var c=a.g;if(c.f){for(var d=0,e=null,f=null,g=c.f;g&&(g.f||(d++,g.b==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.b&&1==d?Kd(c,b):(f?(d=f,d.next==c.h&&(c.h=d),d.next=d.next.next):Ld(c),Md(c,e,3,b)))}a.g=null}else wd(a,3,b)}
function Hd(a,b){a.f||2!=a.b&&3!=a.b||Nd(a);a.h?a.h.next=b:a.f=b;a.h=b}
function Fd(a,b,c,d){var e=zd(null,null,null);e.b=new J(function(a,g){e.g=b?function(c){try{var e=b.call(d,c);a(e)}catch(m){g(m)}}:a;
e.onRejected=c?function(b){try{var e=c.call(d,b);!q(e)&&b instanceof Jd?g(b):a(e)}catch(m){g(m)}}:g});
e.b.g=a;Hd(a,e);return e.b}
J.prototype.o=function(a){this.b=0;wd(this,2,a)};
J.prototype.w=function(a){this.b=0;wd(this,3,a)};
function wd(a,b,c){0==a.b&&(a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself")),a.b=1,Cd(c,a.o,a.w,a)||(a.l=c,a.b=b,a.g=null,Nd(a),3!=b||c instanceof Jd||Od(a,c)))}
function Cd(a,b,c,d){if(a instanceof J)return Hd(a,zd(b||pa,c||null,d)),!0;if(vd(a))return a.then(b,c,d),!0;if(ua(a))try{var e=a.then;if(ta(e))return Pd(a,e,b,c,d),!0}catch(f){return c.call(d,f),!0}return!1}
function Pd(a,b,c,d,e){function f(a){h||(h=!0,d.call(e,a))}
function g(a){h||(h=!0,c.call(e,a))}
var h=!1;try{b.call(a,g,f)}catch(l){f(l)}}
function Nd(a){a.j||(a.j=!0,Rc(a.B,a))}
function Ld(a){var b=null;a.f&&(b=a.f,a.f=b.next,b.next=null);a.f||(a.h=null);return b}
J.prototype.B=function(){for(var a;a=Ld(this);)Md(this,a,this.b,this.l);this.j=!1};
function Md(a,b,c,d){if(3==c&&b.onRejected&&!b.f)for(;a&&a.i;a=a.g)a.i=!1;if(b.b)b.b.g=null,Qd(b,c,d);else try{b.f?b.g.call(b.context):Qd(b,c,d)}catch(e){Rd.call(null,e)}Kc(yd,b)}
function Qd(a,b,c){2==b?a.g.call(a.context,c):a.onRejected&&a.onRejected.call(a.context,c)}
function Od(a,b){a.i=!0;Rc(function(){a.i&&Rd.call(null,b)})}
var Rd=Lc;function Jd(a){C.call(this,a)}
A(Jd,C);Jd.prototype.name="cancel";function K(a){I.call(this);this.j=1;this.h=[];this.i=0;this.b=[];this.f={};this.l=!!a}
A(K,I);k=K.prototype;k.subscribe=function(a,b,c){var d=this.f[a];d||(d=this.f[a]=[]);var e=this.j;this.b[e]=a;this.b[e+1]=b;this.b[e+2]=c;this.j=e+3;d.push(e);return e};
function Sd(a,b,c,d){if(b=a.f[b]){var e=a.b;(b=Fa(b,function(a){return e[a+1]==c&&e[a+2]==d}))&&a.K(b)}}
k.K=function(a){var b=this.b[a];if(b){var c=this.f[b];0!=this.i?(this.h.push(a),this.b[a+1]=pa):(c&&Ga(c,a),delete this.b[a],delete this.b[a+1],delete this.b[a+2])}return!!b};
k.J=function(a,b){var c=this.f[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.l)for(e=0;e<c.length;e++){var g=c[e];Td(this.b[g+1],this.b[g+2],d)}else{this.i++;try{for(e=0,f=c.length;e<f;e++)g=c[e],this.b[g+1].apply(this.b[g+2],d)}finally{if(this.i--,0<this.h.length&&0==this.i)for(;c=this.h.pop();)this.K(c)}}return 0!=e}return!1};
function Td(a,b,c){Rc(function(){a.apply(b,c)})}
k.clear=function(a){if(a){var b=this.f[a];b&&(D(b,this.K,this),delete this.f[a])}else this.b.length=0,this.f={}};
k.m=function(){K.u.m.call(this);this.clear();this.h.length=0};function Ud(a){this.b=a}
Ud.prototype.set=function(a,b){q(b)?this.b.set(a,od(b)):this.b.remove(a)};
Ud.prototype.get=function(a){try{var b=this.b.get(a)}catch(c){return}if(null!==b)try{return JSON.parse(b)}catch(c){throw"Storage: Invalid value was encountered";}};
Ud.prototype.remove=function(a){this.b.remove(a)};function Vd(a){this.b=a}
A(Vd,Ud);function Wd(a){this.data=a}
function Xd(a){return!q(a)||a instanceof Wd?a:new Wd(a)}
Vd.prototype.set=function(a,b){Vd.u.set.call(this,a,Xd(b))};
Vd.prototype.f=function(a){a=Vd.u.get.call(this,a);if(!q(a)||a instanceof Object)return a;throw"Storage: Invalid value was encountered";};
Vd.prototype.get=function(a){if(a=this.f(a)){if(a=a.data,!q(a))throw"Storage: Invalid value was encountered";}else a=void 0;return a};function Yd(a){this.b=a}
A(Yd,Vd);Yd.prototype.set=function(a,b,c){if(b=Xd(b)){if(c){if(c<z()){Yd.prototype.remove.call(this,a);return}b.expiration=c}b.creation=z()}Yd.u.set.call(this,a,b)};
Yd.prototype.f=function(a){var b=Yd.u.f.call(this,a);if(b){var c=b.creation,d=b.expiration;if(d&&d<z()||c&&c>z())Yd.prototype.remove.call(this,a);else return b}};function Zd(a){this.b=a}
A(Zd,Yd);function $d(){}
;function ae(){}
A(ae,$d);ae.prototype.clear=function(){var a=jd(this.D(!0)),b=this;D(a,function(a){b.remove(a)})};function be(a){this.b=a}
A(be,ae);k=be.prototype;k.isAvailable=function(){if(!this.b)return!1;try{return this.b.setItem("__sak","1"),this.b.removeItem("__sak"),!0}catch(a){return!1}};
k.set=function(a,b){try{this.b.setItem(a,b)}catch(c){if(0==this.b.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
k.get=function(a){a=this.b.getItem(a);if(!r(a)&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
k.remove=function(a){this.b.removeItem(a)};
k.D=function(a){var b=0,c=this.b,d=new gd;d.next=function(){if(b>=c.length)throw fd;var d=c.key(b++);if(a)return d;d=c.getItem(d);if(!r(d))throw"Storage mechanism: Invalid value was encountered";return d};
return d};
k.clear=function(){this.b.clear()};
k.key=function(a){return this.b.key(a)};function ce(){var a=null;try{a=window.localStorage||null}catch(b){}this.b=a}
A(ce,be);function de(){var a=null;try{a=window.sessionStorage||null}catch(b){}this.b=a}
A(de,be);function ee(a,b){this.f=a;this.b=null;if(kb&&!(9<=Number(ub))){fe||(fe=new kd);this.b=fe.get(a);this.b||(b?this.b=document.getElementById(b):(this.b=document.createElement("userdata"),this.b.addBehavior("#default#userData"),document.body.appendChild(this.b)),fe.set(a,this.b));try{this.b.load(this.f)}catch(c){this.b=null}}}
A(ee,ae);var ge={".":".2E","!":".21","~":".7E","*":".2A","'":".27","(":".28",")":".29","%":"."},fe=null;function ie(a){return"_"+encodeURIComponent(a).replace(/[.!~*'()%]/g,function(a){return ge[a]})}
k=ee.prototype;k.isAvailable=function(){return!!this.b};
k.set=function(a,b){this.b.setAttribute(ie(a),b);je(this)};
k.get=function(a){a=this.b.getAttribute(ie(a));if(!r(a)&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
k.remove=function(a){this.b.removeAttribute(ie(a));je(this)};
k.D=function(a){var b=0,c=this.b.XMLDocument.documentElement.attributes,d=new gd;d.next=function(){if(b>=c.length)throw fd;var d=c[b++];if(a)return decodeURIComponent(d.nodeName.replace(/\./g,"%")).substr(1);d=d.nodeValue;if(!r(d))throw"Storage mechanism: Invalid value was encountered";return d};
return d};
k.clear=function(){for(var a=this.b.XMLDocument.documentElement,b=a.attributes.length;0<b;b--)a.removeAttribute(a.attributes[b-1].nodeName);je(this)};
function je(a){try{a.b.save(a.f)}catch(b){throw"Storage mechanism: Quota exceeded";}}
;function ke(a,b){this.f=a;this.b=b+"::"}
A(ke,ae);ke.prototype.set=function(a,b){this.f.set(this.b+a,b)};
ke.prototype.get=function(a){return this.f.get(this.b+a)};
ke.prototype.remove=function(a){this.f.remove(this.b+a)};
ke.prototype.D=function(a){var b=this.f.D(!0),c=this,d=new gd;d.next=function(){for(var d=b.next();d.substr(0,c.b.length)!=c.b;)d=b.next();return a?d.substr(c.b.length):c.f.get(d)};
return d};function le(a){if(!ta(a))if(a&&"function"==typeof a.handleEvent)a=x(a.handleEvent,a);else throw Error("Invalid listener argument");return 2147483647<Number(5E3)?-1:p.setTimeout(a,5E3)}
function me(){var a=null;return Id(new J(function(b,c){a=le(function(){b(void 0)});
-1==a&&c(Error("Failed to schedule timer."))}),function(b){p.clearTimeout(a);
throw b;})}
;function ne(a,b,c){var d="script";d=void 0===d?"":d;var e=a.createElement("link");try{Ob(e,b,"preload")}catch(f){return}d&&(e.as=d);c&&(e.nonce=c);if(a=a.getElementsByTagName("head")[0])try{a.appendChild(e)}catch(f){}}
;var oe=/^\.google\.(com?\.)?[a-z]{2,3}$/,pe=/\.(cn|com\.bi|do|sl|ba|by|ma|am)$/;function qe(a){return oe.test(a)&&!pe.test(a)}
var re=p;function se(a){a="https://"+("adservice"+a+"/adsid/integrator.js");var b=["domain="+encodeURIComponent(p.location.hostname)];L[3]>=z()&&b.push("adsid="+encodeURIComponent(L[1]));return a+"?"+b.join("&")}
var L,M;function te(){re=p;L=re.googleToken=re.googleToken||{};var a=z();L[1]&&L[3]>a&&0<L[2]||(L[1]="",L[2]=-1,L[3]=-1,L[4]="",L[6]="");M=re.googleIMState=re.googleIMState||{};qe(M[1])||(M[1]=".google.com");w(M[5])||(M[5]=[]);la(M[6])||(M[6]=!1);w(M[7])||(M[7]=[]);ma(M[8])||(M[8]=0)}
function ue(){te();return L[1]}
var N={da:function(){return 0<M[8]},
Pa:function(){M[8]++},
Qa:function(){0<M[8]&&M[8]--},
Ra:function(){M[8]=0},
shouldRetry:function(){return!1},
ma:function(){return M[5]},
ka:function(a){try{a()}catch(b){p.setTimeout(function(){throw b;},0)}},
ia:function(){if(!N.da()){var a=p.document,b=function(b){b=se(b);a:{try{var c=ac();break a}catch(h){}c=void 0}var d=c;ne(a,b,d);c=a.createElement("script");c.type="text/javascript";d&&(c.nonce=d);c.onerror=function(){return p.processGoogleToken({},2)};
b=Yb(b);Pb(c,b);try{(a.head||a.body||a.documentElement).appendChild(c),N.Pa()}catch(h){}},c=M[1];
b(c);".google.com"!=c&&b(".google.com");b={};var d=(b.newToken="FBT",b);p.setTimeout(function(){return p.processGoogleToken(d,1)},1E3)}}};
function ve(a){te();var b=re.googleToken[5]||0;a&&(0!=b||L[3]>=z()?N.ka(a):(N.ma().push(a),N.ia()));L[3]>=z()&&L[2]>=z()||N.ia()}
function we(a){p.processGoogleToken=p.processGoogleToken||function(a,c){var b=a,e=c;b=void 0===b?{}:b;e=void 0===e?0:e;var f=b.newToken||"",g="NT"==f,h=parseInt(b.freshLifetimeSecs||"",10),l=parseInt(b.validLifetimeSecs||"",10),m=b["1p_jar"]||"";b=b.pucrd||"";te();1==e?N.Ra():N.Qa();if(!f&&N.shouldRetry())qe(".google.com")&&(M[1]=".google.com"),N.ia();else{var t=re.googleToken=re.googleToken||{},P=0==e&&f&&r(f)&&!g&&ma(h)&&0<h&&ma(l)&&0<l&&r(m);g=g&&!N.da()&&(!(L[3]>=z())||"NT"==L[1]);var Ha=!(L[3]>=
z())&&0!=e;if(P||g||Ha)g=z(),h=g+1E3*h,l=g+1E3*l,1E-5>Math.random()&&kc("https://pagead2.googlesyndication.com/pagead/gen_204?id=imerr&err="+e),t[5]=e,t[1]=f,t[2]=h,t[3]=l,t[4]=m,t[6]=b,te();if(P||!N.da()){e=N.ma();for(f=0;f<e.length;f++)N.ka(e[f]);e.length=0}}};
ve(a)}
;function xe(a,b){if(1<b.length)a[b[0]]=b[1];else{var c=b[0],d;for(d in c)a[d]=c[d]}}
var O=window.performance&&window.performance.timing&&window.performance.now?function(){return window.performance.timing.navigationStart+window.performance.now()}:function(){return(new Date).getTime()};var ye=window.yt&&window.yt.config_||window.ytcfg&&window.ytcfg.data_||{};u("yt.config_",ye,void 0);function Q(a){xe(ye,arguments)}
function R(a,b){return a in ye?ye[a]:b}
function ze(a){return R(a,void 0)}
function Ae(){return R("PLAYER_CONFIG",{})}
;z();function Be(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){S(b)}}:a}
function S(a,b,c,d,e){var f=v("yt.logging.errors.log");f?f(a,b,c,d,e):(f=R("ERRORS",[]),f.push([a,b,c,d,e]),Q("ERRORS",f))}
function Ce(a){S(a,"WARNING",void 0,void 0,void 0)}
;var De=q(XMLHttpRequest)?function(){return new XMLHttpRequest}:q(ActiveXObject)?function(){return new ActiveXObject("Microsoft.XMLHTTP")}:null;
function Ee(){if(!De)return null;var a=De();return"open"in a?a:null}
function Fe(a){switch(a&&"status"in a?a.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:return!0;default:return!1}}
;function T(a,b){ta(a)&&(a=Be(a));return window.setTimeout(a,b)}
function Ge(a){window.clearTimeout(a)}
;function He(a){"?"==a.charAt(0)&&(a=a.substr(1));a=a.split("&");for(var b={},c=0,d=a.length;c<d;c++){var e=a[c].split("=");if(1==e.length&&e[0]||2==e.length){var f=decodeURIComponent((e[0]||"").replace(/\+/g," "));e=decodeURIComponent((e[1]||"").replace(/\+/g," "));f in b?w(b[f])?Ka(b[f],e):b[f]=[b[f],e]:b[f]=e}}return b}
;var Ie={"X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL","X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},Je=!1;
function Ke(a,b){b=void 0===b?{}:b;if(!c)var c=window.location.href;var d=G(a)[1]||null,e=oc(G(a)[3]||null);d&&e?(d=c,c=G(a),d=G(d),c=c[3]==d[3]&&c[1]==d[1]&&c[4]==d[4]):c=e?oc(G(c)[3]||null)==e&&(Number(G(c)[4]||null)||null)==(Number(G(a)[4]||null)||null):!0;for(var f in Ie)(d=R(Ie[f]))&&(c||Le(a,f))&&(b[f]=d);if(c||Le(a,"X-YouTube-Utc-Offset"))b["X-YouTube-Utc-Offset"]=-(new Date).getTimezoneOffset();return b}
function Le(a,b){var c=R("CORS_HEADER_WHITELIST")||{},d=oc(G(a)[3]||null);return d?(c=c[d])?0<=Ca(c,b):!1:!0}
function Me(a,b){if(window.fetch&&"XML"!=b.format){var c={method:b.method||"GET",credentials:"same-origin"};b.headers&&(c.headers=b.headers);a=Ne(a,b);var d=Oe(a,b);d&&(c.body=d);b.withCredentials&&(c.credentials="include");var e=!1,f;fetch(a,c).then(function(a){if(!e){e=!0;f&&Ge(f);var c=a.ok,d=function(d){d=d||{};var e=b.context||p;c?b.onSuccess&&b.onSuccess.call(e,d,a):b.onError&&b.onError.call(e,d,a);b.ha&&b.ha.call(e,d,a)};
"JSON"==(b.format||"JSON")&&(c||400<=a.status&&500>a.status)?a.json().then(d,function(){d(null)}):d(null)}});
b.oa&&0<b.timeout&&(f=T(function(){e||(e=!0,Ge(f),b.oa.call(b.context||p))},b.timeout))}else Pe(a,b)}
function Pe(a,b){var c=b.format||"JSON";a=Ne(a,b);var d=Oe(a,b),e=!1,f,g=Qe(a,function(a){if(!e){e=!0;f&&Ge(f);var d=Fe(a),g=null;if(d||400<=a.status&&500>a.status)g=Re(c,a,b.rb);if(d)a:if(a&&204==a.status)d=!0;else{switch(c){case "XML":d=0==parseInt(g&&g.return_code,10);break a;case "RAW":d=!0;break a}d=!!g}g=g||{};var h=b.context||p;d?b.onSuccess&&b.onSuccess.call(h,a,g):b.onError&&b.onError.call(h,a,g);b.ha&&b.ha.call(h,a,g)}},b.method,d,b.headers,b.responseType,b.withCredentials);
b.L&&0<b.timeout&&(f=T(function(){e||(e=!0,g.abort(),Ge(f),b.L.call(b.context||p,g))},b.timeout));
return g}
function Ne(a,b){b.Ca&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=R("XSRF_FIELD_NAME",void 0),d=b.bb;if(d){d[c]&&delete d[c];d=d||{};var e=a.split("#",2);c=e[0];e=1<e.length?"#"+e[1]:"";var f=c.split("?",2);c=f[0];f=He(f[1]||"");for(var g in d)f[g]=d[g];a=rc(c,f)+e}return a}
function Oe(a,b){var c=R("XSRF_FIELD_NAME",void 0),d=R("XSRF_TOKEN",void 0),e=b.postBody||"",f=b.A,g=ze("XSRF_FIELD_NAME"),h;b.headers&&(h=b.headers["Content-Type"]);b.sb||oc(G(a)[3]||null)&&!b.withCredentials&&oc(G(a)[3]||null)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.A&&b.A[g]||(f||(f={}),f[c]=d);f&&r(e)&&(e=He(e),hb(e,f),e=b.pa&&"JSON"==b.pa?JSON.stringify(e):qc(e));f=e||f&&!cb(f);!Je&&f&&"POST"!=b.method&&(Je=!0,S(Error("AJAX request with postData should use POST")));
return e}
function Re(a,b,c){var d=null;switch(a){case "JSON":a=b.responseText;b=b.getResponseHeader("Content-Type")||"";a&&0<=b.indexOf("json")&&(d=JSON.parse(a));break;case "XML":if(b=(b=b.responseXML)?Se(b):null)d={},D(b.getElementsByTagName("*"),function(a){d[a.tagName]=Te(a)})}c&&Ue(d);
return d}
function Ue(a){if(ua(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;var d=Mb(a[b],null);a[c]=d}else Ue(a[b])}}
function Se(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function Te(a){var b="";D(a.childNodes,function(a){b+=a.nodeValue});
return b}
function Ve(a,b){b.method="POST";b.A||(b.A={});Pe(a,b)}
function Qe(a,b,c,d,e,f,g){function h(){4==(l&&"readyState"in l?l.readyState:0)&&b&&Be(b)(l)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var l=Ee();if(!l)return null;"onloadend"in l?l.addEventListener("loadend",h,!1):l.onreadystatechange=h;l.open(c,a,!0);f&&(l.responseType=f);g&&(l.withCredentials=!0);c="POST"==c&&(void 0===window.FormData||!(d instanceof FormData));if(e=Ke(a,e))for(var m in e)l.setRequestHeader(m,e[m]),"content-type"==m.toLowerCase()&&(c=!1);c&&l.setRequestHeader("Content-Type","application/x-www-form-urlencoded");l.send(d);return l}
;var We={},Xe=0;
function Ye(a,b,c,d,e){e=void 0===e?"":e;a&&(c&&(c=Va,c=!(c&&0<=c.toLowerCase().indexOf("cobalt"))),c?a&&(a instanceof F||(a=a.I?a.H():String(a),Hb.test(a)||(a="about:invalid#zClosurez"),a=Jb(a)),b=Gb(a),"about:invalid#zClosurez"===b?a="":(b instanceof Kb?a=b:(a=null,b.ea&&(a=b.aa()),b=Ma(b.I?b.H():String(b)),a=Mb(b,a)),a=encodeURIComponent(String(od(a instanceof Kb&&a.constructor===Kb&&a.g===Lb?a.b:"type_error:SafeHtml")))),/^[\s\xa0]*$/.test(a)||(a=Vb("IFRAME",{src:'javascript:"<body><img src=\\""+'+a+
'+"\\"></body>"',style:"display:none"}),(9==a.nodeType?a:a.ownerDocument||a.document).body.appendChild(a))):e?Qe(a,b,"POST",e,d):R("USE_NET_AJAX_FOR_PING_TRANSPORT",!1)||d?Qe(a,b,"GET","",d):Ze(a,b))}
function Ze(a,b){var c=new Image,d=""+Xe++;We[d]=c;c.onload=c.onerror=function(){b&&We[d]&&b();delete We[d]};
c.src=a}
;var $e={},af=0;
function bf(a,b,c,d,e,f){f=f||{};f.name=c||R("INNERTUBE_CONTEXT_CLIENT_NAME",1);f.version=d||R("INNERTUBE_CONTEXT_CLIENT_VERSION",void 0);b=void 0===b?"ERROR":b;e=void 0===e?!1:e;b=void 0===b?"ERROR":b;e=window&&window.yterr||(void 0===e?!1:e)||!1;if(a&&e&&!(5<=af)){e=a.stacktrace;c=a.columnNumber;a.hasOwnProperty("params")&&(f.params=JSON.stringify(a.params));d=v("window.location.href");if(r(a))a={message:a,name:"Unknown error",lineNumber:"Not available",fileName:d,stack:"Not available"};else{var g=
!1;try{var h=a.lineNumber||a.line||"Not available"}catch(P){h="Not available",g=!0}try{var l=a.fileName||a.filename||a.sourceURL||p.$googDebugFname||d}catch(P){l="Not available",g=!0}a=!g&&a.lineNumber&&a.fileName&&a.stack&&a.message&&a.name?a:{message:a.message||"Not available",name:a.name||"UnknownError",lineNumber:h,fileName:l,stack:a.stack||"Not available"}}e=e||a.stack;h=a.lineNumber.toString();isNaN(h)||isNaN(c)||(h=h+":"+c);if(!($e[a.message]||0<=e.indexOf("/YouTubeCenter.js")||0<=e.indexOf("/mytube.js"))){l=
e;h={bb:{a:"logerror",t:"jserror",type:a.name,msg:a.message.substr(0,1E3),line:h,level:b,"client.name":f.name},A:{url:R("PAGE_NAME",window.location.href),file:a.fileName},method:"POST"};f.version&&(h["client.version"]=f.version);l&&(h.A.stack=l);for(var m in f)h.A["client."+m]=f[m];if(m=R("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS",void 0))for(var t in m)h.A[t]=m[t];Pe(R("ECATCHER_REPORT_HOST","")+"/error_204",h);$e[a.message]=!0;af++}}}
;var cf=window.yt&&window.yt.msgs_||window.ytcfg&&window.ytcfg.msgs||{};u("yt.msgs_",cf,void 0);function df(a){xe(cf,arguments)}
;function ef(a){a&&(a.dataset?a.dataset[ff("loaded")]="true":a.setAttribute("data-loaded","true"))}
function gf(a,b){return a?a.dataset?a.dataset[ff(b)]:a.getAttribute("data-"+b):null}
var hf={};function ff(a){return hf[a]||(hf[a]=String(a).replace(/\-([a-z])/g,function(a,c){return c.toUpperCase()}))}
;var jf=v("ytPubsubPubsubInstance")||new K;K.prototype.subscribe=K.prototype.subscribe;K.prototype.unsubscribeByKey=K.prototype.K;K.prototype.publish=K.prototype.J;K.prototype.clear=K.prototype.clear;u("ytPubsubPubsubInstance",jf,void 0);var kf=v("ytPubsubPubsubSubscribedKeys")||{};u("ytPubsubPubsubSubscribedKeys",kf,void 0);var lf=v("ytPubsubPubsubTopicToKeys")||{};u("ytPubsubPubsubTopicToKeys",lf,void 0);var mf=v("ytPubsubPubsubIsSynchronous")||{};u("ytPubsubPubsubIsSynchronous",mf,void 0);
function nf(a,b){var c=of();if(c){var d=c.subscribe(a,function(){var c=arguments;var f=function(){kf[d]&&b.apply(window,c)};
try{mf[a]?f():T(f,0)}catch(g){S(g)}},void 0);
kf[d]=!0;lf[a]||(lf[a]=[]);lf[a].push(d);return d}return 0}
function pf(a){var b=of();b&&(ma(a)?a=[a]:r(a)&&(a=[parseInt(a,10)]),D(a,function(a){b.unsubscribeByKey(a);delete kf[a]}))}
function qf(a,b){var c=of();c&&c.publish.apply(c,arguments)}
function rf(a){var b=of();if(b)if(b.clear(a),a)sf(a);else for(var c in lf)sf(c)}
function of(){return v("ytPubsubPubsubInstance")}
function sf(a){lf[a]&&(a=lf[a],D(a,function(a){kf[a]&&delete kf[a]}),a.length=0)}
;var tf=/\.vflset|-vfl[a-zA-Z0-9_+=-]+/,uf=/-[a-zA-Z]{2,3}_[a-zA-Z]{2,3}(?=(\/|$))/;function vf(a,b){if(window.spf){var c="";if(a){var d=a.indexOf("jsbin/"),e=a.lastIndexOf(".js"),f=d+6;-1<d&&-1<e&&e>f&&(c=a.substring(f,e),c=c.replace(tf,""),c=c.replace(uf,""),c=c.replace("debug-",""),c=c.replace("tracing-",""))}spf.script.load(a,c,b)}else wf(a,b)}
function wf(a,b){var c=xf(a),d=document.getElementById(c),e=d&&gf(d,"loaded"),f=d&&!e;if(e)b&&b();else{if(b){e=nf(c,b);var g=""+(b[wa]||(b[wa]=++xa));yf[g]=e}f||(d=zf(a,c,function(){gf(d,"loaded")||(ef(d),qf(c),T(y(rf,c),0))}))}}
function zf(a,b,c){var d=document.createElement("SCRIPT");d.id=b;d.onload=function(){c&&setTimeout(c,0)};
d.onreadystatechange=function(){switch(d.readyState){case "loaded":case "complete":d.onload()}};
Pb(d,Yb(a));a=document.getElementsByTagName("head")[0]||document.body;a.insertBefore(d,a.firstChild);return d}
function Af(a){a=xf(a);var b=document.getElementById(a);b&&(rf(a),b.parentNode.removeChild(b))}
function Bf(a,b){if(a&&b){var c=""+(b[wa]||(b[wa]=++xa));(c=yf[c])&&pf(c)}}
function xf(a){var b=document.createElement("a");Nb(b,a);a=b.href.replace(/^[a-zA-Z]+:\/\//,"//");return"js-"+Ua(a)}
var yf={};function Cf(){}
function Df(a,b){return Ef(a,1,b)}
;function Ff(){}
n(Ff,Cf);function Ef(a,b,c){isNaN(c)&&(c=void 0);var d=v("yt.scheduler.instance.addJob");return d?d(a,b,c):void 0===c?(a(),NaN):T(a,c||0)}
function Gf(a){if(!isNaN(a)){var b=v("yt.scheduler.instance.cancelJob");b?b(a):Ge(a)}}
Ff.prototype.start=function(){var a=v("yt.scheduler.instance.start");a&&a()};
Ff.prototype.pause=function(){var a=v("yt.scheduler.instance.pause");a&&a()};
qa(Ff);Ff.getInstance();var Hf=[],If=!1;function Jf(){if("1"!=$a(Ae(),"args","privembed")){var a=function(){If=!0;"google_ad_status"in window?Q("DCLKSTAT",1):Q("DCLKSTAT",2)};
vf("//static.doubleclick.net/instream/ad_status.js",a);Hf.push(Df(function(){If||"google_ad_status"in window||(Bf("//static.doubleclick.net/instream/ad_status.js",a),Q("DCLKSTAT",3))},5E3))}}
function Kf(){return parseInt(R("DCLKSTAT",0),10)}
;function Lf(){this.f=!1;this.b=null}
Lf.prototype.initialize=function(a,b,c,d){b?(this.f=!0,vf(b,function(){this.f=!1;window.botguard?Mf(this,c,d):(Af(b),S(Error("Unable to load Botguard from "+b),"WARNING"))}.bind(this))):a&&(eval(a),window.botguard?Mf(this,c,d):S(Error("Unable to load Botguard from JS"),"WARNING"))};
function Mf(a,b,c){try{a.b=new window.botguard.bg(b)}catch(d){Ce(d)}c&&c(b)}
Lf.prototype.invoke=function(){return this.b?this.b.invoke():null};
Lf.prototype.dispose=function(){this.b=null};function U(a){return R("EXPERIMENT_FLAGS",{})[a]}
;var Nf=new Lf,Of=!1,Pf=0,Qf="";function Rf(a){U("botguard_periodic_refresh")?Pf=O():U("botguard_always_refresh")&&(Qf=a)}
function Sf(a){if(a){if(Nf.f)return!1;if(U("botguard_periodic_refresh"))return 72E5<O()-Pf;if(U("botguard_always_refresh"))return Qf!=a}else return!1;return!Of}
function Tf(){return null!==Nf.b}
function Uf(){return Nf.invoke()}
;var Vf=0;u("ytDomDomGetNextId",v("ytDomDomGetNextId")||function(){return++Vf},void 0);var Wf={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function Xf(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.ctrlKey=this.altKey=!1;this.clientY=this.clientX=0;this.changedTouches=this.touches=null;if(a=a||window.event){this.event=a;for(var b in a)b in Wf||(this[b]=a[b]);(b=a.target||a.srcElement)&&3==b.nodeType&&(b=b.parentNode);this.target=b;if(b=a.relatedTarget)try{b=b.nodeName?b:null}catch(c){b=null}else"mouseover"==this.type?
b=a.fromElement:"mouseout"==this.type&&(b=a.toElement);this.relatedTarget=b;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.b=a.pageX;this.f=a.pageY}}
function Yf(a){if(document.body&&document.documentElement){var b=document.body.scrollTop+document.documentElement.scrollTop;a.b=a.clientX+(document.body.scrollLeft+document.documentElement.scrollLeft);a.f=a.clientY+b}}
Xf.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
Xf.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
Xf.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var bb=v("ytEventsEventsListeners")||{};u("ytEventsEventsListeners",bb,void 0);var Zf=v("ytEventsEventsCounter")||{count:0};u("ytEventsEventsCounter",Zf,void 0);
function $f(a,b,c,d){d=void 0===d?{}:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return ab(function(e){var f=la(e[4])&&e[4]==!!d,g=ua(e[4])&&ua(d)&&eb(e[4],d);return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&(f||g)})}
var ag=Ab(function(){var a=!1;try{var b=Object.defineProperty({},"capture",{get:function(){a=!0}});
window.addEventListener("test",null,b)}catch(c){}return a});
function W(a,b,c,d){d=void 0===d?{}:d;if(!a||!a.addEventListener&&!a.attachEvent)return"";var e=$f(a,b,c,d);if(e)return e;e=++Zf.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(d){d=new Xf(d);if(!Xb(d.relatedTarget,function(b){return b==a}))return d.currentTarget=a,d.type=b,c.call(a,d)}:function(b){b=new Xf(b);
b.currentTarget=a;return c.call(a,b)};
g=Be(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),ag()||la(d)?a.addEventListener(b,g,d):a.addEventListener(b,g,!!d.capture)):a.attachEvent("on"+b,g);bb[e]=[a,b,c,g,d];return e}
function bg(a){a&&("string"==typeof a&&(a=[a]),D(a,function(a){if(a in bb){var b=bb[a],d=b[0],e=b[1],f=b[3];b=b[4];d.removeEventListener?ag()||la(b)?d.removeEventListener(e,f,b):d.removeEventListener(e,f,!!b.capture):d.detachEvent&&d.detachEvent("on"+e,f);delete bb[a]}}))}
;function cg(a){this.o=a;this.b=null;this.i=0;this.l=null;this.j=0;this.f=[];for(a=0;4>a;a++)this.f.push(0);this.h=0;this.C=W(window,"mousemove",x(this.F,this));a=x(this.w,this);ta(a)&&(a=Be(a));this.G=window.setInterval(a,25)}
A(cg,I);cg.prototype.F=function(a){q(a.b)||Yf(a);var b=a.b;q(a.f)||Yf(a);this.b=new Qb(b,a.f)};
cg.prototype.w=function(){if(this.b){var a=O();if(0!=this.i){var b=this.l,c=this.b,d=b.x-c.x;b=b.y-c.y;d=Math.sqrt(d*d+b*b)/(a-this.i);this.f[this.h]=.5<Math.abs((d-this.j)/this.j)?1:0;for(c=b=0;4>c;c++)b+=this.f[c]||0;3<=b&&this.o();this.j=d}this.i=a;this.l=this.b;this.h=(this.h+1)%4}};
cg.prototype.m=function(){window.clearInterval(this.G);bg(this.C)};var dg={};
function eg(a){var b=void 0===a?{}:a;a=void 0===b.Da?!0:b.Da;b=void 0===b.Na?!1:b.Na;if(null==v("_lact",window)){var c=parseInt(R("LACT"),10);c=isFinite(c)?z()-Math.max(c,0):-1;u("_lact",c,window);u("_fact",c,window);-1==c&&fg();W(document,"keydown",fg);W(document,"keyup",fg);W(document,"mousedown",fg);W(document,"mouseup",fg);a&&(b?W(window,"touchmove",function(){gg("touchmove",200)},{passive:!0}):(W(window,"resize",function(){gg("resize",200)}),W(window,"scroll",function(){gg("scroll",200)})));
new cg(function(){gg("mouse",100)});
W(document,"touchstart",fg,{passive:!0});W(document,"touchend",fg,{passive:!0})}}
function gg(a,b){dg[a]||(dg[a]=!0,Df(function(){fg();dg[a]=!1},b))}
function fg(){null==v("_lact",window)&&eg();var a=z();u("_lact",a,window);-1==v("_fact",window)&&u("_fact",a,window);(a=v("ytglobal.ytUtilActivityCallback_"))&&a()}
function hg(){var a=v("_lact",window);return null==a?-1:Math.max(z()-a,0)}
;var ig=Math.pow(2,16)-1,jg={log_event:"events",log_interaction:"interactions"},kg=Object.create(null);kg.log_event="GENERIC_EVENT_LOGGING";kg.log_interaction="INTERACTION_LOGGING";var lg={},mg=0,X=v("ytLoggingTransportLogPayloadsQueue_")||{};u("ytLoggingTransportLogPayloadsQueue_",X,void 0);var ng=v("ytLoggingTransportTokensToCttTargetIds_")||{};u("ytLoggingTransportTokensToCttTargetIds_",ng,void 0);var og=v("ytLoggingTransportDispatchedStats_")||{};u("ytLoggingTransportDispatchedStats_",og,void 0);
u("ytytLoggingTransportCapturedTime_",v("ytLoggingTransportCapturedTime_")||{},void 0);function pg(a,b){if(a.W){var c=a.W;var d={};c.videoId?d.videoId=c.videoId:c.playlistId&&(d.playlistId=c.playlistId);ng[a.W.token]=d;c=qg(a.endpoint,a.W.token)}else c=qg(a.endpoint);c.push(a.payload);lg[a.endpoint]=new b;c.length>=(Number(U("web_logging_max_batch")||0)||20)?rg():sg()}
function rg(){Ge(mg);if(!cb(X)){for(var a in X){var b=lg[a];if(b){var c=void 0,d=a,e=b,f=jg[d],g=og[d]||{};og[d]=g;b=Math.round(O());for(c in X[d]){var h=e.b;h={client:{hl:h.Ga,gl:h.Fa,clientName:h.Ea,clientVersion:h.innertubeContextClientVersion}};var l=window.devicePixelRatio;l&&1!=l&&(h.client.screenDensityFloat=String(l));R("DELEGATED_SESSION_ID")&&(h.user={onBehalfOfUser:R("DELEGATED_SESSION_ID")});h={context:h};h[f]=qg(d,c);g.dispatchedEventCount=g.dispatchedEventCount||0;g.dispatchedEventCount+=
h[f].length;if(l=ng[c])a:{var m=h,t=c;if(l.videoId)var P="VIDEO";else if(l.playlistId)P="PLAYLIST";else break a;m.credentialTransferTokenTargetId=l;m.context=m.context||{};m.context.user=m.context.user||{};m.context.user.credentialTransferTokens=[{token:t,scope:P}]}delete ng[c];l=h;l.requestTimeMs=b;(P=R("EVENT_ID",void 0))&&U("enable_gel_web_client_event_id")&&(m=(R("BATCH_CLIENT_COUNTER",void 0)||0)+1,m>ig&&(m=1),Q("BATCH_CLIENT_COUNTER",m),l.serializedClientEventId={serializedEventId:P,clientCounter:m});
tg(e,d,h,{retry:!0})}c=g;d=b;c.previousDispatchMs&&(b=d-c.previousDispatchMs,e=c.diffCount||0,c.averageTimeBetweenDispatchesMs=e?(c.averageTimeBetweenDispatchesMs*e+b)/(e+1):b,c.diffCount=e+1);c.previousDispatchMs=d;delete X[a]}}cb(X)||sg()}}
function sg(){Ge(mg);mg=T(rg,R("LOGGING_BATCH_TIMEOUT",1E4))}
function qg(a,b){b=void 0===b?"":b;X[a]=X[a]||{};X[a][b]=X[a][b]||[];return X[a][b]}
;function ug(a,b,c,d){var e=vg,f={};f.eventTimeMs=Math.round(c||O());f[a]=b;f.context={lastActivityMs:String(c?-1:hg())};pg({endpoint:"log_event",payload:f,W:d},e)}
;function wg(a,b){var c={"X-Goog-Visitor-Id":R("VISITOR_DATA","")};if(b&&b.includes("www.youtube-nocookie.com"))return c;var d;a?d="Bearer "+v("gapi.auth.getToken")().ob:d=Ic([]);d&&(c.Authorization=d,c["X-Goog-AuthUser"]=R("SESSION_INDEX",0));return c}
function xg(a){a=Object.assign({},a);delete a.Authorization;var b=Ic();if(b){var c=new Yc;c.update(R("INNERTUBE_API_KEY",void 0));c.update(b);b=c.digest();if(!wb)for(wb={},xb={},c=0;65>c;c++)wb[c]="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(c),xb[c]="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".charAt(c);c=xb;for(var d=[],e=0;e<b.length;e+=3){var f=b[e],g=e+1<b.length,h=g?b[e+1]:0,l=e+2<b.length,m=l?b[e+2]:0,t=f>>2;f=(f&3)<<4|h>>4;h=(h&15)<<2|m>>
6;m&=63;l||(m=64,g||(h=64));d.push(c[t],c[f],c[h],c[m])}a.hash=d.join("")}return a}
;function yg(a,b,c,d){zb.set(""+a,b,c,"/",void 0===d?"youtube.com":d,!1)}
;function zg(){var a=new ce;(a=a.isAvailable()?new ke(a,"yt.innertube"):null)||(a=new ee("yt.innertube"),a=a.isAvailable()?a:null);this.b=a?new Yd(a):null;this.f=document.domain||window.location.hostname}
zg.prototype.set=function(a,b,c,d){c=c||31104E3;this.remove(a);if(this.b)try{this.b.set(a,b,z()+1E3*c);return}catch(f){}var e="";if(d)try{e=escape(od(b))}catch(f){return}else e=escape(b);yg(a,e,c,this.f)};
zg.prototype.get=function(a,b){var c=void 0,d=!this.b;if(!d)try{c=this.b.get(a)}catch(e){d=!0}if(d&&(c=zb.get(""+a,void 0))&&(c=unescape(c),b))try{c=JSON.parse(c)}catch(e){this.remove(a),c=void 0}return c};
zg.prototype.remove=function(a){this.b&&this.b.remove(a);var b=this.f;zb.remove(""+a,"/",void 0===b?"youtube.com":b)};var Ag=new zg;function Bg(a,b,c,d){if(d)return null;d=Ag.get("nextId",!0)||1;var e=Ag.get("requests",!0)||{};e[d]={method:a,request:b,authState:xg(c),requestTime:Math.round(O())};Ag.set("nextId",d+1,86400,!0);Ag.set("requests",e,86400,!0);return d}
function Cg(a){var b=Ag.get("requests",!0)||{};delete b[a];Ag.set("requests",b,86400,!0)}
function Dg(a){var b=Ag.get("requests",!0);if(b){for(var c in b){var d=b[c];if(!(6E4>Math.round(O())-d.requestTime)){var e=d.authState,f=xg(wg(!1));eb(e,f)&&(e=d.request,"requestTimeMs"in e&&(e.requestTimeMs=Math.round(O())),tg(a,d.method,e,{}));delete b[c]}}Ag.set("requests",b,86400,!0)}}
;function vg(a){var b=this;this.b=a||{innertubeApiKey:ze("INNERTUBE_API_KEY"),innertubeApiVersion:ze("INNERTUBE_API_VERSION"),Ea:R("INNERTUBE_CONTEXT_CLIENT_NAME","WEB"),innertubeContextClientVersion:ze("INNERTUBE_CONTEXT_CLIENT_VERSION"),Ga:ze("INNERTUBE_CONTEXT_HL"),Fa:ze("INNERTUBE_CONTEXT_GL"),Ha:ze("INNERTUBE_HOST_OVERRIDE")||"",Ia:!!R("INNERTUBE_USE_THIRD_PARTY_AUTH",!1)};Ef(function(){Dg(b)},0,5E3)}
function tg(a,b,c,d){!R("VISITOR_DATA")&&.01>Math.random()&&S(Error("Missing VISITOR_DATA when sending innertube request."),"WARNING");var e={headers:{"Content-Type":"application/json"},method:"POST",A:c,pa:"JSON",L:function(){d.L()},
oa:d.L,onSuccess:function(a,b){if(d.onSuccess)d.onSuccess(b)},
na:function(a){if(d.onSuccess)d.onSuccess(a)},
onError:function(a,b){if(d.onError)d.onError(b)},
tb:function(a){if(d.onError)d.onError(a)},
timeout:d.timeout,withCredentials:!0},f="",g=a.b.Ha;g&&(f=g);g=a.b.Ia||!1;var h=wg(g,f);Object.assign(e.headers,h);e.headers.Authorization&&!f&&(e.headers["x-origin"]=window.location.origin);var l=""+f+("/youtubei/"+a.b.innertubeApiVersion+"/"+b)+"?alt=json&key="+a.b.innertubeApiKey,m;if(d.retry&&U("retry_web_logging_batches")&&"www.youtube-nocookie.com"!=f&&(m=Bg(b,c,h,g))){var t=e.onSuccess,P=e.na;e.onSuccess=function(a,b){Cg(m);t(a,b)};
c.na=function(a,b){Cg(m);P(a,b)}}try{U("use_fetch_for_op_xhr")?Me(l,e):Ve(l,e)}catch(Ha){if("InvalidAccessError"==Ha)m&&(Cg(m),m=0),S(Error("An extension is blocking network request."),"WARNING");
else throw Ha;}m&&Ef(function(){Dg(a)},0,5E3)}
;var Eg=z().toString();
function Fg(){a:{if(window.crypto&&window.crypto.getRandomValues)try{var a=Array(16),b=new Uint8Array(16);window.crypto.getRandomValues(b);for(var c=0;c<a.length;c++)a[c]=b[c];var d=a;break a}catch(e){}d=Array(16);for(a=0;16>a;a++){b=z();for(c=0;c<b%23;c++)d[a]=Math.random();d[a]=Math.floor(256*Math.random())}if(Eg)for(a=1,b=0;b<Eg.length;b++)d[a%16]=d[a%16]^d[(a-1)%16]/4^Eg.charCodeAt(b),a++}a=[];for(b=0;b<d.length;b++)a.push("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(d[b]&63));
return a.join("")}
;var Gg=Fg();function Hg(a){this.b=a}
function Ig(a){var b={};void 0!==a.b.trackingParams?b.trackingParams=a.b.trackingParams:(b.veType=a.b.veType,null!=a.b.veCounter&&(b.veCounter=a.b.veCounter),null!=a.b.elementIndex&&(b.elementIndex=a.b.elementIndex));void 0!==a.b.dataElement&&(b.dataElement=Ig(a.b.dataElement));void 0!==a.b.youtubeData&&(b.youtubeData=a.b.youtubeData);return b}
var Jg=1;function Kg(a){a=void 0===a?0:a;return 0==a?"client-screen-nonce":"client-screen-nonce."+a}
function Lg(a){a=void 0===a?0:a;return 0==a?"ROOT_VE_TYPE":"ROOT_VE_TYPE."+a}
function Mg(){var a=R(Lg(0),void 0),b;a?b=new Hg({veType:a,youtubeData:void 0}):b=null;return b}
function Ng(){var a=void 0===a?0:a;var b=R(Kg(a));b||0!=a||(b=R("EVENT_ID"));return b?b:null}
function Og(a,b){var c=void 0===c?0:c;Q(Kg(c),a);Q(Lg(c),b);0==c&&(c=function(){setTimeout(function(){a&&ug("foregroundHeartbeatScreenAssociated",{clientDocumentNonce:Gg,clientScreenNonce:a})},0)},"requestAnimationFrame"in window?window.requestAnimationFrame(c):c())}
;function Pg(a,b,c){b=void 0===b?{}:b;c=void 0===c?!1:c;var d=R("EVENT_ID");d&&(b.ei||(b.ei=d));if(b){d=a;var e=R("VALID_SESSION_TEMPDATA_DOMAINS",[]),f=oc(G(window.location.href)[3]||null);f&&e.push(f);f=oc(G(d)[3]||null);if(0<=Ca(e,f)||!f&&0==d.lastIndexOf("/",0))if(U("autoescape_tempdata_url")&&(e=document.createElement("a"),Nb(e,d),d=e.href),d){f=G(d);d=f[5];e=f[6];f=f[7];var g="";d&&(g+=d);e&&(g+="?"+e);f&&(g+="#"+f);d=g;e=d.indexOf("#");if(d=0>e?d:d.substr(0,e)){if(b.itct||b.ved)b.csn=b.csn||
Ng();if(h){var h=parseInt(h,10);isFinite(h)&&0<h&&(d="ST-"+Ua(d).toString(36),b=b?qc(b):"",yg(d,b,h||5))}else h="ST-"+Ua(d).toString(36),b=b?qc(b):"",yg(h,b,5)}}}if(c)return!1;if((window.ytspf||{}).enabled)spf.navigate(a);else{var l=void 0===l?{}:l;var m=void 0===m?"":m;var t=void 0===t?window:t;c=t.location;a=rc(a,l)+m;a=a instanceof F?a:Ib(a);c.href=Gb(a)}return!0}
;function Qg(a,b,c){a={attachChild:{csn:a,parentVisualElement:Ig(b),visualElements:[Ig(c)]}};a.eventTimeMs=Math.round(O());a.lactMs=hg();pg({endpoint:"log_interaction",payload:a},vg)}
;function Rg(a){a=a||{};this.url=a.url||"";this.args=a.args||fb(Sg);this.assets=a.assets||{};this.attrs=a.attrs||fb(Tg);this.fallback=a.fallback||null;this.fallbackMessage=a.fallbackMessage||null;this.html5=!!a.html5;this.disable=a.disable||{};this.loaded=!!a.loaded;this.messages=a.messages||{}}
var Sg={enablejsapi:1},Tg={};Rg.prototype.clone=function(){var a=new Rg,b;for(b in this)if(this.hasOwnProperty(b)){var c=this[b];a[b]="object"==ra(c)?fb(c):c}return a};function Ug(){I.call(this);this.b=[]}
n(Ug,I);Ug.prototype.m=function(){for(;this.b.length;){var a=this.b.pop();a.target.removeEventListener(a.name,a.qb)}I.prototype.m.call(this)};var Vg=/cssbin\/(?:debug-)?([a-zA-Z0-9_-]+?)(?:-2x|-web|-rtl|-vfl|.css)/;function Wg(a){a=a||"";if(window.spf){var b=a.match(Vg);spf.style.load(a,b?b[1]:"",void 0)}else Xg(a)}
function Xg(a){var b=Yg(a),c=document.getElementById(b),d=c&&gf(c,"loaded");d||c&&!d||(c=Zg(a,b,function(){gf(c,"loaded")||(ef(c),qf(b),T(y(rf,b),0))}))}
function Zg(a,b,c){var d=document.createElement("link");d.id=b;d.onload=function(){c&&setTimeout(c,0)};
a=Yb(a);Ob(d,a,"stylesheet");(document.getElementsByTagName("head")[0]||document.body).appendChild(d);return d}
function Yg(a){var b=document.createElement("A");a=Jb(a);Nb(b,a);b=b.href.replace(/^[a-zA-Z]+:\/\//,"//");return"css-"+Ua(b)}
;var $g=v("ytLoggingLatencyUsageStats_")||{};u("ytLoggingLatencyUsageStats_",$g,void 0);var ah=0;function bh(a){$g[a]=$g[a]||{count:0};var b=$g[a];b.count++;b.time=O();ah||(ah=Ef(ch,0,5E3));return 10<b.count?(11==b.count&&bf(Error("CSI data exceeded logging limit with key: "+a),0==a.indexOf("info")?"WARNING":"ERROR"),!0):!1}
function ch(){var a=O(),b;for(b in $g)6E4<a-$g[b].time&&delete $g[b];ah=0}
;function dh(a,b){this.version=a;this.args=b}
;function eh(a){this.topic=a}
eh.prototype.toString=function(){return this.topic};var fh=v("ytPubsub2Pubsub2Instance")||new K;K.prototype.subscribe=K.prototype.subscribe;K.prototype.unsubscribeByKey=K.prototype.K;K.prototype.publish=K.prototype.J;K.prototype.clear=K.prototype.clear;u("ytPubsub2Pubsub2Instance",fh,void 0);u("ytPubsub2Pubsub2SubscribedKeys",v("ytPubsub2Pubsub2SubscribedKeys")||{},void 0);u("ytPubsub2Pubsub2TopicToKeys",v("ytPubsub2Pubsub2TopicToKeys")||{},void 0);u("ytPubsub2Pubsub2IsAsync",v("ytPubsub2Pubsub2IsAsync")||{},void 0);
u("ytPubsub2Pubsub2SkipSubKey",null,void 0);function gh(a,b){var c=v("ytPubsub2Pubsub2Instance");c&&c.publish.call(c,a.toString(),a,b)}
;var hh=window.performance||window.mozPerformance||window.msPerformance||window.webkitPerformance||{};function ih(){var a=R("TIMING_TICK_EXPIRATION");a||(a={},Q("TIMING_TICK_EXPIRATION",a));return a}
function jh(){var a=ih(),b;for(b in a)Gf(a[b]);Q("TIMING_TICK_EXPIRATION",{})}
;function kh(a,b){dh.call(this,1,arguments)}
n(kh,dh);function lh(a,b){dh.call(this,1,arguments)}
n(lh,dh);var mh=new eh("aft-recorded"),nh=new eh("timing-sent");var oh={vc:!0},Y={},ph=(Y.ad_allowed="adTypesAllowed",Y.ad_at="adType",Y.ad_cpn="adClientPlaybackNonce",Y.ad_docid="adVideoId",Y.yt_ad_an="adNetworks",Y.p="httpProtocol",Y.t="transportProtocol",Y.cpn="clientPlaybackNonce",Y.csn="clientScreenNonce",Y.docid="videoId",Y.is_nav="isNavigation",Y.yt_lt="loadType",Y.yt_ad="isMonetized",Y.nr="webInfo.navigationReason",Y.ncnp="webInfo.nonPreloadedNodeCount",Y.paused="playerInfo.isPausedOnLoad",Y.fmt="playerInfo.itag",Y.yt_pl="watchInfo.isPlaylist",Y.yt_ad_pr=
"prerollAllowed",Y.yt_red="isRedSubscriber",Y.st="serverTimeMs",Y.vph="viewportHeight",Y.vpw="viewportWidth",Y.yt_vis="isVisible",Y),qh="ap c cver ei srt yt_fss yt_li plid vpil vpni vpst yt_eil vpni2 vpil2 icrc icrt pa GetBrowse_rid GetPlayer_rid GetSearch_rid GetWatchNext_rid cmt d_vpct d_vpnfi d_vpni pc pfa pfeh pftr prerender psc rc start tcrt tcrc ssr vpr vps yt_abt yt_fn yt_fs yt_pft yt_pre yt_pt yt_pvis yt_ref yt_sts".split(" "),rh="isNavigation isMonetized playerInfo.isPausedOnLoad prerollAllowed isRedSubscriber isVisible watchInfo.isPlaylist".split(" "),
sh=!1;function vh(){var a=wh().info.yt_lt="hot_bg";xh().info_yt_lt=a;if(yh())if("yt_lt"in ph){var b=ph.yt_lt;0<=Ca(rh,b)&&(a=!!a);if(yh()){var c={};b=b.split(".");for(var d=c,e=0;e<b.length-1;e++)d[b[e]]=d[b[e]]||{},d=d[b[e]];d[b[b.length-1]]=a;a=zh();b=Object.keys(c).join("");bh("info_"+b+"_"+a)||(c.clientActionNonce=a,ug("latencyActionInfo",c,void 0,void 0))}}else 0<=Ca(qh,"yt_lt")||S(Error("Unknown label yt_lt logged with GEL CSI."))}
function Ah(){var a=Bh();if(a.aft)return a.aft;for(var b=R("TIMING_AFT_KEYS",["ol"]),c=b.length,d=0;d<c;d++){var e=a[b[d]];if(e)return e}return NaN}
var Ch=x(hh.clearResourceTimings||hh.webkitClearResourceTimings||hh.mozClearResourceTimings||hh.msClearResourceTimings||hh.oClearResourceTimings||pa,hh);function zh(){var a=wh().nonce;a||(a=Fg(),wh().nonce=a);return a}
function Bh(){return wh().tick}
function xh(){var a=wh();"gel"in a||(a.gel={});return a.gel}
function wh(){return v("ytcsi.data_")||Dh()}
function Dh(){var a={tick:{},info:{}};u("ytcsi.data_",a,void 0);return a}
function Eh(a,b){u("yt.timing."+(b||"")+"pingSent_",a,void 0)}
function Fh(){var a=Bh(),b=a.pbr,c=a.vc;a=a.pbs;return b&&c&&a&&b<c&&c<a&&1==wh().info.yt_pvis}
function yh(){return!!U("csi_on_gel")}
function Gh(){jh();if(!yh()){var a=Bh(),b=wh().info,c=a._start;for(f in a)if(0==f.lastIndexOf("_",0)&&w(a[f])){var d=f.slice(1);if(d in oh){var e=Ea(a[f],function(a){return Math.round(a-c)});
b["all_"+d]=e.join()}delete a[f]}var f=!!b.ap;if(d=v("ytglobal.timingReportbuilder_")){if(a=d(a,b,void 0))Hh(a,f),Dh(),Ch(),Eh(!1,void 0),R("TIMING_ACTION")&&Q("PREVIOUS_ACTION",R("TIMING_ACTION")),Q("TIMING_ACTION","")}else{var g=R("CSI_SERVICE_NAME","youtube");d={v:2,s:g,action:R("TIMING_ACTION",void 0)};e=vh.srt;void 0!==a.srt&&delete b.srt;if(b.h5jse){var h=window.location.protocol+v("ytplayer.config.assets.js");(h=hh.getEntriesByName?hh.getEntriesByName(h)[0]:null)?b.h5jse=Math.round(b.h5jse-
h.responseEnd):delete b.h5jse}a.aft=Ah();Fh()&&"youtube"==g&&(vh(),g=a.vc,h=a.pbs,delete a.aft,b.aft=Math.round(h-g));for(var l in b)"_"!=l.charAt(0)&&(d[l]=b[l]);a.ps=O();b={};l=[];for(var m in a)"_"!=m.charAt(0)&&(g=Math.round(a[m]-c),b[m]=g,l.push(m+"."+g));d.rt=l.join(",");(a=v("ytdebug.logTiming"))&&a(d,b);Hh(d,f,void 0);gh(nh,new lh(b.aft+(e||0),void 0))}}}
function Hh(a,b,c){if(U("debug_csi_data")){var d=v("yt.timing.csiData");d||(d=[],u("yt.timing.csiData",d,void 0));d.push({page:location.href,time:new Date,args:a})}d="";for(var e in a)d+="&"+e+"="+a[e];a="/csi_204?"+d.substring(1);if(window.navigator&&window.navigator.sendBeacon&&b){var f=void 0===f?"":f;try{window.navigator&&window.navigator.sendBeacon&&window.navigator.sendBeacon(a,f)||Ye(a,void 0,void 0,void 0,f)}catch(g){Ye(a,void 0,void 0,void 0,f)}}else Ye(a);Eh(!0,c)}
function Ih(a){if("_"!=a[0]){var b=a;hh.mark&&(0==b.lastIndexOf("mark_",0)||(b="mark_"+b),hh.mark(b))}b=Bh();var c=O();b[a]&&(b["_"+a]=b["_"+a]||[b[a]],b["_"+a].push(c));b[a]=c;b=ih();if(c=b[a])Gf(c),b[a]=0;xh()["tick_"+a]=void 0;O();yh()?(b=zh(),"_start"==a?bh("baseline_"+b)||ug("latencyActionBaselined",{clientActionNonce:b},void 0,void 0):bh("tick_"+a+"_"+b)||ug("latencyActionTicked",{tickName:a,clientActionNonce:b},void 0,void 0),a=!0):a=!1;if(a=!a)a=!v("yt.timing.pingSent_");if(a&&(b=ze("TIMING_ACTION"),
a=Bh(),v("ytglobal.timingready_")&&b&&a._start&&(b=Ah()))){U("tighter_critical_section")&&!sh&&(gh(mh,new kh(Math.round(b-a._start),void 0)),sh=!0);b=!0;c=R("TIMING_WAIT",[]);if(c.length)for(var d=0,e=c.length;d<e;++d)if(!(c[d]in a)){b=!1;break}b&&Gh()}}
;function Jh(a,b){I.call(this);this.l=this.T=a;this.F=b;this.o=!1;this.f={};this.P=this.C=null;this.G=new K;$c(this,y(ad,this.G));this.i={};this.N=this.R=this.h=this.Y=this.b=null;this.M=!1;this.j=this.w=null;this.U={};this.ta=["onReady"];this.X=null;this.ja=NaN;this.O={};Kh(this);this.V("WATCH_LATER_VIDEO_ADDED",this.Ka.bind(this));this.V("WATCH_LATER_VIDEO_REMOVED",this.La.bind(this));this.V("onAdAnnounce",this.wa.bind(this));this.ua=new Ug(this);$c(this,y(ad,this.ua))}
n(Jh,I);k=Jh.prototype;
k.ga=function(a){if(!this.g){a instanceof Rg||(a=new Rg(a));this.Y=a;this.b=a.clone();this.h=this.b.attrs.id||this.h;"video-player"==this.h&&(this.h=this.F,this.b.attrs.id=this.F);this.l.id==this.h&&(this.h+="-player",this.b.attrs.id=this.h);this.b.args.enablejsapi="1";this.b.args.playerapiid=this.F;this.R||(this.R=Lh(this,this.b.args.jsapicallback||"onYouTubePlayerReady"));this.b.args.jsapicallback=null;if(a=this.b.attrs.width)this.l.style.width=lc(Number(a)||a);if(a=this.b.attrs.height)this.l.style.height=lc(Number(a)||
a);Mh(this);this.o&&Nh(this)}};
k.za=function(){return this.Y};
function Nh(a){a.b.loaded||(a.b.loaded=!0,"0"!=a.b.args.autoplay?a.f.loadVideoByPlayerVars(a.b.args):a.f.cueVideoByPlayerVars(a.b.args))}
function Oh(a){var b=!0,c=Ph(a);c&&a.b&&(a=a.b,b=gf(c,"version")==a.assets.js);return b&&!!v("yt.player.Application.create")}
function Mh(a){if(!a.g&&!a.M){var b=Oh(a);if(b&&"html5"==(Ph(a)?"html5":null))a.N="html5",a.o||Qh(a);else if(Rh(a),a.N="html5",b&&a.j)a.T.appendChild(a.j),Qh(a);else{a.b.loaded=!0;var c=!1;a.w=function(){c=!0;var b=a.b.clone();v("yt.player.Application.create")(a.T,b);Qh(a)};
a.M=!0;b?a.w():(vf(a.b.assets.js,a.w),Wg(a.b.assets.css),Sh(a)&&!c&&u("yt.player.Application.create",null,void 0))}}}
function Ph(a){var b=Sb(a.h);!b&&a.l&&a.l.querySelector&&(b=a.l.querySelector("#"+a.h));return b}
function Qh(a){if(!a.g){var b=Ph(a),c=!1;b&&b.getApiInterface&&b.getApiInterface()&&(c=!0);c?(a.M=!1,b.isNotServable&&b.isNotServable(a.b.args.video_id)||Th(a)):a.ja=T(function(){Qh(a)},50)}}
function Th(a){Kh(a);a.o=!0;var b=Ph(a);b.addEventListener&&(a.C=Uh(a,b,"addEventListener"));b.removeEventListener&&(a.P=Uh(a,b,"removeEventListener"));var c=b.getApiInterface();c=c.concat(b.getInternalApiInterface());for(var d=0;d<c.length;d++){var e=c[d];a.f[e]||(a.f[e]=Uh(a,b,e))}for(var f in a.i)a.C(f,a.i[f]);Nh(a);a.R&&a.R(a.f);a.G.J("onReady",a.f)}
function Uh(a,b,c){var d=b[c];return function(){try{return a.X=null,d.apply(b,arguments)}catch(e){"sendAbandonmentPing"!=c&&(e.message+=" ("+c+")",a.X=e,Ce(e))}}}
function Kh(a){a.o=!1;if(a.P)for(var b in a.i)a.P(b,a.i[b]);for(var c in a.O)Ge(parseInt(c,10));a.O={};a.C=null;a.P=null;for(var d in a.f)a.f[d]=null;a.f.addEventListener=a.V.bind(a);a.f.removeEventListener=a.Sa.bind(a);a.f.destroy=a.dispose.bind(a);a.f.getLastError=a.Aa.bind(a);a.f.getPlayerType=a.Ba.bind(a);a.f.getCurrentVideoConfig=a.za.bind(a);a.f.loadNewVideoConfig=a.ga.bind(a);a.f.isReady=a.Ja.bind(a)}
k.Ja=function(){return this.o};
k.V=function(a,b){var c=this,d=Lh(this,b);if(d){if(!(0<=Ca(this.ta,a)||this.i[a])){var e=Vh(this,a);this.C&&this.C(a,e)}this.G.subscribe(a,d);"onReady"==a&&this.o&&T(function(){d(c.f)},0)}};
k.Sa=function(a,b){if(!this.g){var c=Lh(this,b);c&&Sd(this.G,a,c)}};
function Lh(a,b){var c=b;if("string"==typeof b){if(a.U[b])return a.U[b];c=function(){var a=v(b);a&&a.apply(p,arguments)};
a.U[b]=c}return c?c:null}
function Vh(a,b){var c="ytPlayer"+b+a.F;a.i[b]=c;p[c]=function(c){var d=T(function(){if(!a.g){a.G.J(b,c);var e=a.O,g=String(d);g in e&&delete e[g]}},0);
db(a.O,String(d))};
return c}
k.wa=function(a){qf("a11y-announce",a)};
k.Ka=function(a){qf("WATCH_LATER_VIDEO_ADDED",a)};
k.La=function(a){qf("WATCH_LATER_VIDEO_REMOVED",a)};
k.Ba=function(){return this.N||(Ph(this)?"html5":null)};
k.Aa=function(){return this.X};
function Rh(a){Ih("dcp");a.cancel();Kh(a);a.N=null;a.b&&(a.b.loaded=!1);var b=Ph(a);b&&(Oh(a)||!Sh(a)?a.j=b:(b&&b.destroy&&b.destroy(),a.j=null));for(a=a.T;b=a.firstChild;)a.removeChild(b)}
k.cancel=function(){this.w&&Bf(this.b.assets.js,this.w);Ge(this.ja);this.M=!1};
k.m=function(){Rh(this);if(this.j&&this.b&&this.j.destroy)try{this.j.destroy()}catch(b){S(b)}this.U=null;for(var a in this.i)p[this.i[a]]=null;this.Y=this.b=this.f=null;delete this.T;delete this.l;I.prototype.m.call(this)};
function Sh(a){return a.b&&a.b.args&&a.b.args.fflags?-1!=a.b.args.fflags.indexOf("player_destroy_old_version=true"):!1}
;var Wh={},Xh="player_uid_"+(1E9*Math.random()>>>0);function Yh(a){var b="player";b=r(b)?Sb(b):b;var c=Xh+"_"+(b[wa]||(b[wa]=++xa)),d=Wh[c];if(d)return d.ga(a),d.f;d=new Jh(b,c);Wh[c]=d;qf("player-added",d.f);$c(d,y(Zh,d));T(function(){d.ga(a)},0);
return d.f}
function Zh(a){delete Wh[a.F]}
;function $h(){var a=ai(),b=bi();if(!a&&!b||!window.JSON)return null;try{var c=a.get("yt-player-two-stage-token")}catch(d){}if(!r(c))try{c=b.get("yt-player-two-stage-token")}catch(d){}if(!r(c))return null;try{c=JSON.parse(c,void 0)}catch(d){}return c}
var bi=Ab(function(){var a=new ce;return a.isAvailable()?new Zd(a):null}),ai=Ab(function(){var a=new de;
return a.isAvailable()?new Zd(a):null});function ci(a){return(0==a.search("cue")||0==a.search("load"))&&"loadModule"!=a}
function di(a,b,c){r(a)&&(a={mediaContentUrl:a,startSeconds:b,suggestedQuality:c});b=/\/([ve]|embed)\/([^#?]+)/.exec(a.mediaContentUrl);a.videoId=b&&b[2]?b[2]:null;return ei(a)}
function ei(a,b,c){if(ua(a)){b="endSeconds startSeconds mediaContentUrl suggestedQuality videoId two_stage_token".split(" ");c={};for(var d=0;d<b.length;d++){var e=b[d];a[e]&&(c[e]=a[e])}return c}return{videoId:a,startSeconds:b,suggestedQuality:c}}
function fi(a,b,c,d){if(ua(a)&&!w(a)){b="playlist list listType index startSeconds suggestedQuality".split(" ");c={};for(d=0;d<b.length;d++){var e=b[d];a[e]&&(c[e]=a[e])}return c}b={index:b,startSeconds:c,suggestedQuality:d};r(a)&&16==a.length?b.list="PL"+a:b.playlist=a;return b}
function gi(a){var b=a.video_id||a.videoId;if(r(b)){var c=$h()||{},d=$h()||{};q(void 0)?d[b]=void 0:delete d[b];var e=z()+3E5,f=bi();if(f&&window.JSON){r(d)||(d=JSON.stringify(d,void 0));try{f.set("yt-player-two-stage-token",d,e)}catch(g){f.remove("yt-player-two-stage-token")}}(b=c[b])&&(a.two_stage_token=b)}}
;function hi(a){I.call(this);this.b=a;this.b.subscribe("command",this.qa,this);this.f={};this.i=!1}
A(hi,I);k=hi.prototype;k.start=function(){this.i||this.g||(this.i=!0,ii(this.b,"RECEIVING"))};
k.qa=function(a,b,c){if(this.i&&!this.g){var d=b||{};switch(a){case "addEventListener":r(d.event)&&(a=d.event,a in this.f||(c=x(this.Ua,this,a),this.f[a]=c,this.addEventListener(a,c)));break;case "removeEventListener":r(d.event)&&ji(this,d.event);break;default:this.h.isReady()&&this.h[a]&&(b=ki(a,b||{}),c=this.h.handleExternalCall(a,b,c||null),(c=li(a,c))&&this.i&&!this.g&&ii(this.b,a,c))}}};
k.Ua=function(a,b){this.i&&!this.g&&ii(this.b,a,this.ba(a,b))};
k.ba=function(a,b){if(null!=b)return{value:b}};
function ji(a,b){b in a.f&&(a.removeEventListener(b,a.f[b]),delete a.f[b])}
k.m=function(){var a=this.b;a.g||Sd(a.b,"command",this.qa,this);this.b=null;for(var b in this.f)ji(this,b);hi.u.m.call(this)};function mi(a,b){hi.call(this,b);this.h=a;this.start()}
A(mi,hi);mi.prototype.addEventListener=function(a,b){this.h.addEventListener(a,b)};
mi.prototype.removeEventListener=function(a,b){this.h.removeEventListener(a,b)};
function ki(a,b){switch(a){case "loadVideoById":return b=ei(b),gi(b),[b];case "cueVideoById":return b=ei(b),gi(b),[b];case "loadVideoByPlayerVars":return gi(b),[b];case "cueVideoByPlayerVars":return gi(b),[b];case "loadPlaylist":return b=fi(b),gi(b),[b];case "cuePlaylist":return b=fi(b),gi(b),[b];case "seekTo":return[b.seconds,b.allowSeekAhead];case "playVideoAt":return[b.index];case "setVolume":return[b.volume];case "setPlaybackQuality":return[b.suggestedQuality];case "setPlaybackRate":return[b.suggestedRate];
case "setLoop":return[b.loopPlaylists];case "setShuffle":return[b.shufflePlaylist];case "getOptions":return[b.module];case "getOption":return[b.module,b.option];case "setOption":return[b.module,b.option,b.value];case "handleGlobalKeyDown":return[b.keyCode,b.shiftKey]}return[]}
function li(a,b){switch(a){case "isMuted":return{muted:b};case "getVolume":return{volume:b};case "getPlaybackRate":return{playbackRate:b};case "getAvailablePlaybackRates":return{availablePlaybackRates:b};case "getVideoLoadedFraction":return{videoLoadedFraction:b};case "getPlayerState":return{playerState:b};case "getCurrentTime":return{currentTime:b};case "getPlaybackQuality":return{playbackQuality:b};case "getAvailableQualityLevels":return{availableQualityLevels:b};case "getDuration":return{duration:b};
case "getVideoUrl":return{videoUrl:b};case "getVideoEmbedCode":return{videoEmbedCode:b};case "getPlaylist":return{playlist:b};case "getPlaylistIndex":return{playlistIndex:b};case "getOptions":return{options:b};case "getOption":return{option:b}}}
mi.prototype.ba=function(a,b){switch(a){case "onReady":return;case "onStateChange":return{playerState:b};case "onPlaybackQualityChange":return{playbackQuality:b};case "onPlaybackRateChange":return{playbackRate:b};case "onError":return{errorCode:b}}return mi.u.ba.call(this,a,b)};
mi.prototype.m=function(){mi.u.m.call(this);delete this.h};function ni(a,b,c,d){I.call(this);this.f=b||null;this.o="*";this.h=c||null;this.sessionId=null;this.channel=d||null;this.C=!!a;this.l=x(this.w,this);window.addEventListener("message",this.l)}
n(ni,I);ni.prototype.w=function(a){if(!("*"!=this.h&&a.origin!=this.h||this.f&&a.source!=this.f)&&r(a.data)){try{var b=JSON.parse(a.data)}catch(c){return}if(!(null==b||this.C&&(this.sessionId&&this.sessionId!=b.id||this.channel&&this.channel!=b.channel))&&b)switch(b.event){case "listening":"null"!=a.origin&&(this.h=this.o=a.origin);this.f=a.source;this.sessionId=b.id;this.b&&(this.b(),this.b=null);break;case "command":this.i&&(!this.j||0<=Ca(this.j,b.func))&&this.i(b.func,b.args,a.origin)}}};
ni.prototype.sendMessage=function(a,b){var c=b||this.f;if(c){this.sessionId&&(a.id=this.sessionId);this.channel&&(a.channel=this.channel);try{var d=od(a);c.postMessage(d,this.o)}catch(e){S(e,"WARNING")}}};
ni.prototype.m=function(){window.removeEventListener("message",this.l);I.prototype.m.call(this)};function oi(a,b,c){ni.call(this,a,b,c||R("POST_MESSAGE_ORIGIN",void 0)||window.document.location.protocol+"//"+window.document.location.hostname,"widget");this.j=this.b=this.i=null}
n(oi,ni);function pi(){var a=this.f=new oi(!!R("WIDGET_ID_ENFORCE")),b=x(this.Oa,this);a.i=b;a.j=null;this.f.channel="widget";if(a=R("WIDGET_ID"))this.f.sessionId=a;this.h=[];this.j=!1;this.i={}}
k=pi.prototype;k.Oa=function(a,b,c){"addEventListener"==a&&b?(a=b[0],this.i[a]||"onReady"==a||(this.addEventListener(a,qi(this,a)),this.i[a]=!0)):this.sa(a,b,c)};
k.sa=function(){};
function qi(a,b){return x(function(a){this.sendMessage(b,a)},a)}
k.addEventListener=function(){};
k.ya=function(){this.j=!0;this.sendMessage("initialDelivery",this.ca());this.sendMessage("onReady");D(this.h,this.ra,this);this.h=[]};
k.ca=function(){return null};
function ri(a,b){a.sendMessage("infoDelivery",b)}
k.ra=function(a){this.j?this.f.sendMessage(a):this.h.push(a)};
k.sendMessage=function(a,b){this.ra({event:a,info:void 0==b?null:b})};
k.dispose=function(){this.f=null};function si(a){pi.call(this);this.b=a;this.g=[];this.addEventListener("onReady",x(this.Ma,this));this.addEventListener("onVideoProgress",x(this.Ya,this));this.addEventListener("onVolumeChange",x(this.Za,this));this.addEventListener("onApiChange",x(this.Ta,this));this.addEventListener("onPlaybackQualityChange",x(this.Va,this));this.addEventListener("onPlaybackRateChange",x(this.Wa,this));this.addEventListener("onStateChange",x(this.Xa,this));this.addEventListener("onWebglSettingsChanged",x(this.ab,
this))}
A(si,pi);k=si.prototype;k.sa=function(a,b,c){if(this.b[a]){b=b||[];if(0<b.length&&ci(a)){var d=b;if(ua(d[0])&&!w(d[0]))d=d[0];else{var e={};switch(a){case "loadVideoById":case "cueVideoById":e=ei.apply(window,d);break;case "loadVideoByUrl":case "cueVideoByUrl":e=di.apply(window,d);break;case "loadPlaylist":case "cuePlaylist":e=fi.apply(window,d)}d=e}gi(d);b.length=1;b[0]=d}this.b.handleExternalCall(a,b,c);ci(a)&&ri(this,this.ca())}};
k.Ma=function(){var a=x(this.ya,this);this.f.b=a};
k.addEventListener=function(a,b){this.g.push({eventType:a,listener:b});this.b.addEventListener(a,b)};
k.ca=function(){if(!this.b)return null;var a=this.b.getApiInterface();Ga(a,"getVideoData");for(var b={apiInterface:a},c=0,d=a.length;c<d;c++){var e=a[c],f=e;if(0==f.search("get")||0==f.search("is")){f=e;var g=0;0==f.search("get")?g=3:0==f.search("is")&&(g=2);f=f.charAt(g).toLowerCase()+f.substr(g+1);try{var h=this.b[e]();b[f]=h}catch(l){}}}b.videoData=this.b.getVideoData();b.currentTimeLastUpdated_=z()/1E3;return b};
k.Xa=function(a){a={playerState:a,currentTime:this.b.getCurrentTime(),duration:this.b.getDuration(),videoData:this.b.getVideoData(),videoStartBytes:0,videoBytesTotal:this.b.getVideoBytesTotal(),videoLoadedFraction:this.b.getVideoLoadedFraction(),playbackQuality:this.b.getPlaybackQuality(),availableQualityLevels:this.b.getAvailableQualityLevels(),videoUrl:this.b.getVideoUrl(),playlist:this.b.getPlaylist(),playlistIndex:this.b.getPlaylistIndex(),currentTimeLastUpdated_:z()/1E3,playbackRate:this.b.getPlaybackRate(),
mediaReferenceTime:this.b.getMediaReferenceTime()};this.b.getVideoContentRect&&(a.videoContentRect=this.b.getVideoContentRect());this.b.getProgressState&&(a.progressState=this.b.getProgressState());this.b.getStoryboardFormat&&(a.storyboardFormat=this.b.getStoryboardFormat());ri(this,a)};
k.Va=function(a){ri(this,{playbackQuality:a})};
k.Wa=function(a){ri(this,{playbackRate:a})};
k.Ta=function(){for(var a=this.b.getOptions(),b={namespaces:a},c=0,d=a.length;c<d;c++){var e=a[c],f=this.b.getOptions(e);b[e]={options:f};for(var g=0,h=f.length;g<h;g++){var l=f[g],m=this.b.getOption(e,l);b[e][l]=m}}this.sendMessage("apiInfoDelivery",b)};
k.Za=function(){ri(this,{muted:this.b.isMuted(),volume:this.b.getVolume()})};
k.Ya=function(a){a={currentTime:a,videoBytesLoaded:this.b.getVideoBytesLoaded(),videoLoadedFraction:this.b.getVideoLoadedFraction(),currentTimeLastUpdated_:z()/1E3,playbackRate:this.b.getPlaybackRate(),mediaReferenceTime:this.b.getMediaReferenceTime()};this.b.getProgressState&&(a.progressState=this.b.getProgressState());ri(this,a)};
k.ab=function(){if(this.b.getSphericalProperties){var a={sphericalProperties:this.b.getSphericalProperties()};ri(this,a)}};
k.dispose=function(){si.u.dispose.call(this);for(var a=0;a<this.g.length;a++){var b=this.g[a];this.b.removeEventListener(b.eventType,b.listener)}this.g=[]};function ti(){I.call(this);this.b=new K;$c(this,y(ad,this.b))}
A(ti,I);ti.prototype.subscribe=function(a,b,c){return this.g?0:this.b.subscribe(a,b,c)};
ti.prototype.j=function(a,b){this.g||this.b.J.apply(this.b,arguments)};function ui(a,b,c){ti.call(this);this.f=a;this.h=b;this.i=c}
A(ui,ti);function ii(a,b,c){if(!a.g){var d=a.f;d.g||a.h!=d.b||(a={id:a.i,command:b},c&&(a.data=c),d.b.postMessage(od(a),d.h))}}
ui.prototype.m=function(){this.h=this.f=null;ui.u.m.call(this)};function vi(a,b,c){I.call(this);this.b=a;this.h=c;this.i=W(window,"message",x(this.j,this));this.f=new ui(this,a,b);$c(this,y(ad,this.f))}
A(vi,I);vi.prototype.j=function(a){var b;if(b=!this.g)if(b=a.origin==this.h)a:{b=this.b;do{b:{var c=a.source;do{if(c==b){c=!0;break b}if(c==c.parent)break;c=c.parent}while(null!=c);c=!1}if(c){b=!0;break a}b=b.opener}while(null!=b);b=!1}if(b&&(b=a.data,r(b))){try{b=JSON.parse(b)}catch(d){return}b.command&&(c=this.f,c.g||c.j("command",b.command,b.data,a.origin))}};
vi.prototype.m=function(){bg(this.i);this.b=null;vi.u.m.call(this)};function wi(){var a=fb(xi),b;return Id(new J(function(c,d){a.onSuccess=function(a){Fe(a)?c(a):d(new yi("Request failed, status="+a.status,"net.badstatus",a))};
a.onError=function(a){d(new yi("Unknown request error","net.unknown",a))};
a.L=function(a){d(new yi("Request timed out","net.timeout",a))};
b=Pe("//googleads.g.doubleclick.net/pagead/id",a)}),function(a){a instanceof Jd&&b.abort();
return Ad(a)})}
function yi(a,b){C.call(this,a+", errorCode="+b);this.errorCode=b;this.name="PromiseAjaxError"}
n(yi,C);function zi(a){this.g=void 0===a?null:a;this.f=0;this.b=null}
zi.prototype.then=function(a,b,c){return this.g?this.g.then(a,b,c):1===this.f&&a?(a=a.call(c,this.b),vd(a)?a:Ai(a)):2===this.f&&b?(a=b.call(c,this.b),vd(a)?a:Bi(a)):this};
zi.prototype.getValue=function(){return this.b};
ud(zi);function Bi(a){var b=new zi;a=void 0===a?null:a;b.f=2;b.b=void 0===a?null:a;return b}
function Ai(a){var b=new zi;a=void 0===a?null:a;b.f=1;b.b=void 0===a?null:a;return b}
;function Ci(a){C.call(this,a.message||a.description||a.name);this.isMissing=a instanceof Di;this.isTimeout=a instanceof yi&&"net.timeout"==a.errorCode;this.isCanceled=a instanceof Jd}
n(Ci,C);Ci.prototype.name="BiscottiError";function Di(){C.call(this,"Biscotti ID is missing from server")}
n(Di,C);Di.prototype.name="BiscottiMissingError";var xi={format:"RAW",method:"GET",timeout:5E3,withCredentials:!0},Ei=null;function Fi(){if("1"===$a(Ae(),"args","privembed"))return Ad(Error("Biscotti ID is not available in private embed mode"));Ei||(Ei=Id(wi().then(Gi),function(a){return Hi(2,a)}));
return Ei}
function Gi(a){a=a.responseText;if(0!=a.lastIndexOf(")]}'",0))throw new Di;a=JSON.parse(a.substr(4));if(1<(a.type||1))throw new Di;a=a.id;Ii(a);Ei=Ai(a);Ji(18E5,2);return a}
function Hi(a,b){var c=new Ci(b);Ii("");Ei=Bi(c);0<a&&Ji(12E4,a-1);throw c;}
function Ji(a,b){T(function(){Id(wi().then(Gi,function(a){return Hi(b,a)}),pa)},a)}
function Ii(a){u("yt.ads.biscotti.lastId_",a,void 0)}
function Ki(){try{var a=v("yt.ads.biscotti.getId_");return a?a():Fi()}catch(b){return Ad(b)}}
;function Li(a){C.apply(this,arguments)}
n(Li,C);Li.prototype.name="YuzuError";function Mi(){var a=new Li("ID is missing"),b=new Li("Timeout"),c=null,d=!1;we(function(){c=ue();d=!0});
if(d)return c?Ai(c):Bi(a);var e=new J(function(b,c){we(function(){var d=ue();d?b(d):c(a)})}),f=me().then(function(){return Ad(b)});
return Gd(Dd([e,f]),function(){return f.cancel()})}
;function Ni(a){if("1"!==$a(Ae(),"args","privembed")){a&&(v("yt.ads.biscotti.getId_")||Aa("yt.ads.biscotti.getId_",Fi));try{var b=Ki();if(U("enable_yuzu")){v("yt.ads.yuzu.getId_")||u("yt.ads.yuzu.getId_",Mi,void 0);try{var c=v("yt.ads.yuzu.getId_")()}catch(d){c=Ad(d)}}else c=Ad(new Li("unimplemented"));Ed([b,c]).then(function(a){var b=a[0];a=a[1];if(b.Z||a.Z){b=b.value;a=a.value;var c={};c.dt=Dc;c.flash="0";a:{try{var d=window.top.location.href}catch(Za){d=2;break a}d=null!=d?d==window.document.location.href?
0:1:2}d=(c.frm=d,c);d.u_tz=-(new Date).getTimezoneOffset();var h=void 0===h?B:h;try{var l=h.history.length}catch(Za){l=0}d.u_his=l;d.u_java=!!B.navigator&&"unknown"!==typeof B.navigator.javaEnabled&&!!B.navigator.javaEnabled&&B.navigator.javaEnabled();B.screen&&(d.u_h=B.screen.height,d.u_w=B.screen.width,d.u_ah=B.screen.availHeight,d.u_aw=B.screen.availWidth,d.u_cd=B.screen.colorDepth);B.navigator&&B.navigator.plugins&&(d.u_nplug=B.navigator.plugins.length);B.navigator&&B.navigator.mimeTypes&&(d.u_nmime=
B.navigator.mimeTypes.length);d.ca_type="image";if(U("enable_server_side_search_pyv")||U("enable_server_side_mweb_search_pyv")){l=window;try{var m=l.screenX;var t=l.screenY}catch(Za){}try{var P=l.outerWidth;var Ha=l.outerHeight}catch(Za){}try{var th=l.innerWidth;var uh=l.innerHeight}catch(Za){}m=[l.screenLeft,l.screenTop,m,t,l.screen?l.screen.availWidth:void 0,l.screen?l.screen.availTop:void 0,P,Ha,th,uh];t=window.top;try{var V=(t||window).document,va="CSS1Compat"==V.compatMode?V.documentElement:
V.body;var Ia=(new Rb(va.clientWidth,va.clientHeight)).round()}catch(Za){Ia=new Rb(-12245933,-12245933)}V={};va=0;p.SVGElement&&p.document.createElementNS&&(va|=1);t=hc();t["allow-top-navigation-by-user-activation"]&&(va|=2);t["allow-popups-to-escape-sandbox"]&&(va|=4);V.bc=va;V.bih=Ia.height;V.biw=Ia.width;V.brdim=m.join();Ia=(V.vis={visible:1,hidden:2,prerender:3,preview:4,unloaded:5}[Ba.visibilityState||Ba.webkitVisibilityState||Ba.mozVisibilityState||""]||0,V.wgl=!!B.WebGLRenderingContext,V);
for(var he in Ia)d[he]=Ia[he]}void 0!==b&&(d.bid=b);void 0!==a&&(d.anid=a);d.bsq=Oi++;Ve("//www.youtube.com/ad_data_204",{Ca:!1,A:d,withCredentials:!0})}});
T(Ni,18E5)}catch(d){S(d)}}}
var Oi=0;var Z=v("ytglobal.prefsUserPrefsPrefs_")||{};u("ytglobal.prefsUserPrefsPrefs_",Z,void 0);function Pi(){this.b=R("ALT_PREF_COOKIE_NAME","PREF");var a=zb.get(""+this.b,void 0);if(a){a=decodeURIComponent(a).split("&");for(var b=0;b<a.length;b++){var c=a[b].split("="),d=c[0];(c=c[1])&&(Z[d]=c.toString())}}}
k=Pi.prototype;k.get=function(a,b){Qi(a);Ri(a);var c=void 0!==Z[a]?Z[a].toString():null;return null!=c?c:b?b:""};
k.set=function(a,b){Qi(a);Ri(a);if(null==b)throw Error("ExpectedNotNull");Z[a]=b.toString()};
k.remove=function(a){Qi(a);Ri(a);delete Z[a]};
k.save=function(){yg(this.b,this.dump(),63072E3)};
k.clear=function(){for(var a in Z)delete Z[a]};
k.dump=function(){var a=[],b;for(b in Z)a.push(b+"="+encodeURIComponent(String(Z[b])));return a.join("&")};
function Ri(a){if(/^f([1-9][0-9]*)$/.test(a))throw Error("ExpectedRegexMatch: "+a);}
function Qi(a){if(!/^\w+$/.test(a))throw Error("ExpectedRegexMismatch: "+a);}
function Si(a){a=void 0!==Z[a]?Z[a].toString():null;return null!=a&&/^[A-Fa-f0-9]+$/.test(a)?parseInt(a,16):null}
qa(Pi);var Ti=null,Ui=null,Vi=null,Wi={};function Xi(a){ug(a.payload_name,a.payload,void 0,void 0)}
function Yi(a){var b=a.id;a=a.ve_type;var c=Jg++;a=new Hg({veType:a,veCounter:c,elementIndex:void 0,dataElement:void 0,youtubeData:void 0});Wi[b]=a;b=Ng();c=Mg();b&&c&&Qg(b,c,a)}
function Zi(a){var b=a.csn;a=a.root_ve_type;if(b&&a&&(Og(b,a),a=Mg()))for(var c in Wi){var d=Wi[c];d&&Qg(b,a,d)}}
function $i(a){Wi[a.id]=new Hg({trackingParams:a.tracking_params})}
function aj(a){var b=Ng();a=Wi[a.id];b&&a&&ug("visualElementGestured",{csn:b,ve:Ig(a),gestureType:"INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK"})}
function bj(a){a=a.ids;var b=Ng();if(b)for(var c=0;c<a.length;c++){var d=Wi[a[c]];d&&ug("visualElementShown",{csn:b,ve:Ig(d),eventType:1})}}
function cj(){var a=Ti;a&&a.startInteractionLogging&&a.startInteractionLogging()}
;u("yt.setConfig",Q,void 0);u("yt.config.set",Q,void 0);u("yt.setMsg",df,void 0);u("yt.msgs.set",df,void 0);u("yt.logging.errors.log",bf,void 0);
u("writeEmbed",function(){var a=R("PLAYER_CONFIG",void 0);Ni(!0);"gvn"==a.args.ps&&(document.body.style.backgroundColor="transparent");var b=document.referrer,c=R("POST_MESSAGE_ORIGIN");window!=window.top&&b&&b!=document.URL&&(a.args.loaderUrl=b);R("LIGHTWEIGHT_AUTOPLAY")&&(a.args.autoplay="1");a.args.autoplay&&gi(a.args);Ti=a=Yh(a);a.addEventListener("onScreenChanged",Zi);a.addEventListener("onLogClientVeCreated",Yi);a.addEventListener("onLogServerVeCreated",$i);a.addEventListener("onLogToGel",Xi);
a.addEventListener("onLogVeClicked",aj);a.addEventListener("onLogVesShown",bj);a.addEventListener("onReady",cj);b=R("POST_MESSAGE_ID","player");R("ENABLE_JS_API")?Vi=new si(a):R("ENABLE_POST_API")&&r(b)&&r(c)&&(Ui=new vi(window.parent,b,c),Vi=new mi(a,Ui.f));c=ze("BG_P");Sf(c)&&(R("BG_I")||R("BG_IU"))&&(Of=!0,Nf.initialize(R("BG_I",null),R("BG_IU",null),c,Rf));Jf()},void 0);
u("yt.www.watch.ads.restrictioncookie.spr",function(a){Ye(a+"mac_204?action_fcts=1");return!0},void 0);
var dj=Be(function(){Ih("ol");var a=Pi.getInstance(),b=!!((Si("f"+(Math.floor(119/31)+1))||0)&67108864),c=1<window.devicePixelRatio;if(document.body&&dd(document.body,"exp-invert-logo"))if(c&&!dd(document.body,"inverted-hdpi")){var d=document.body;d.classList?d.classList.add("inverted-hdpi"):dd(d,"inverted-hdpi")||(d.className+=0<d.className.length?" inverted-hdpi":"inverted-hdpi")}else!c&&dd(document.body,"inverted-hdpi")&&ed();b!=c&&(b="f"+(Math.floor(119/31)+1),d=Si(b)||0,d=c?d|67108864:d&-67108865,
0==d?delete Z[b]:Z[b]=d.toString(16).toString(),a.save())}),ej=Be(function(){var a=Ti;
a&&a.sendAbandonmentPing&&a.sendAbandonmentPing();R("PL_ATT")&&Nf.dispose();a=0;for(var b=Hf.length;a<b;a++)Gf(Hf[a]);Hf.length=0;Af("//static.doubleclick.net/instream/ad_status.js");If=!1;Q("DCLKSTAT",0);bd(Vi,Ui);if(a=Ti)a.removeEventListener("onScreenChanged",Zi),a.removeEventListener("onLogClientVeCreated",Yi),a.removeEventListener("onLogServerVeCreated",$i),a.removeEventListener("onLogToGel",Xi),a.removeEventListener("onLogVeClicked",aj),a.removeEventListener("onLogVesShown",bj),a.removeEventListener("onReady",
cj),a.destroy();Wi={}});
window.addEventListener?(window.addEventListener("load",dj),window.addEventListener("unload",ej)):window.attachEvent&&(window.attachEvent("onload",dj),window.attachEvent("onunload",ej));Aa("yt.abuse.player.botguardInitialized",v("yt.abuse.player.botguardInitialized")||Tf);Aa("yt.abuse.player.invokeBotguard",v("yt.abuse.player.invokeBotguard")||Uf);Aa("yt.abuse.dclkstatus.checkDclkStatus",v("yt.abuse.dclkstatus.checkDclkStatus")||Kf);
Aa("yt.player.exports.navigate",v("yt.player.exports.navigate")||Pg);Aa("yt.util.activity.init",v("yt.util.activity.init")||eg);Aa("yt.util.activity.getTimeSinceActive",v("yt.util.activity.getTimeSinceActive")||hg);Aa("yt.util.activity.setTimestamp",v("yt.util.activity.setTimestamp")||fg);}).call(this);
