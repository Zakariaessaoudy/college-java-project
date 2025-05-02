# college-java-project
project for a college system thet manage classes, presence ,... with Java
here's how we must use git: 
mora ma derna kamlin clone lhad repo ha chno khass ndiro daba:

1) awalan kola wa7ed fina ghadi yssawb branch dyalo bhad command:
   git checkout -b feature/smyat-classes-dyalk
   
3) ghadi tkhdem fl code dyal les classes dyalk

4) talitan ghadi tpushi dok les changements li derti hakada:
      * git add .
      * git commit -m "message 9sir kywssf chno bdlti"
      * git push origin feature/smyat-classes-dyalk

6) daba lbranch dyalk kayna f github ms , ana kadalik branch dyali pushitha haaaa daba rkzo m3aya hna kayna la3ba:

7) kola wa7ed fina (machi mjmo3in tab3an) ghadi idkhol lgithub (maw9i3 iliktroni) oghadi imchi lrepo dyal proji

8) ghadi tban lih wa7ed lbotona smitha pull request aywrak 3la mha. (had l7araka tat3ni : "khouti chofoni chno bdelt flcode ,chno zedt, wach kayn cho khata2 , ...etc")

9) 7na ghadi nchofo dak pull request mjmo3in oghadi nvalidiwh (comme ça n3erfo jami3 7aytiyat lprojet machi kola wa7ed ipushi mabgha oytkhrbj lina dakchi)

10) haaa daba chefna taghyirat li derna obghina nkhlto dakchi atapiw had commands(katkouno deja dayrin push l akhir version mn branchatkom):
         * git pull origin main
         * git merge feature/smyat-classes-dyalk
         * git push origin main

11) rdo lbal ila khdmo 2 3la nfss lfichier/classe onbdlto bjojkom fiha oderto step 11, ghadi itl3 likom git error, 7awlo kola wa7ed ikhdem 3la dakchi dyalo.

12) li nafrid 3endkom branch dyalkom obghito lmain ib9a f7alto ms tjibo les changements li fiha lbranchma dyalkom ,tapiw had commandes
       * git checkout main
       * git pull origin main
       * git checkout feature/smyat-classes-dyalk
       * git merge main
    
this keeps you updated bles changements ds7abk ms kolchi flbranch dyalk
----------------------------------------
**had l'analogie anktbha bl3rbia ta3rabt bach twda7 lfikra**

تخيل GitHub بحال شي مطبخ مشترك:

كل واحد فيكم كيطيب وجبة ديالو (الميزة أو الكود) فركن ديالو (فرع خاص).

منين كيسالي، كيعرض على صحابو يدوقو (يعني كيدير Pull Request باش يشوفو الكود).

صحابو كيدخلو يشوفو الطبق، كيعطيو رأيهم، وكيقولو ليه واش مزيان ولا خاصو تعديل.

منين كيوافقو عليه، كيجمعوه فالطابلة الكبيرة (الفرع الرئيسي main).

ومن بعد، كل واحد كيمشي يشوف شنو تزاد فالطابلة، وكيقدر يدوق من ݣاع الطباسل (يعني كيدير pull باش ياخذ التغييرات الجداد).

kantmna twda7 likom lfikra o ila 3endkom chi so2al fhad chi mrhba swlo chatgpt
