using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Threading;

namespace ccnaV6V52
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private TextBlock oplossing = new TextBlock();
        private TextBox invoer = new TextBox();
        private DispatcherTimer timer = new DispatcherTimer();
        private Dictionary<string, string> vragen = new Dictionary<string, string>();

        public MainWindow()
        {
            InitializeComponent();
            voegvragentoe();
            this.Topmost = true;
            this.ResizeMode = ResizeMode.NoResize;

            timer.Interval = TimeSpan.FromMilliseconds(1700);
            timer.Tick += Timer_Tick;

            invoer.Width = 200;
            invoer.Height = 25;
            invoer.Margin = new Thickness(0, 0, 0, 0);
            invoer.BorderThickness = new Thickness(0);
            invoer.MouseLeave += Invoer_MouseLeave;
            invoer.Foreground = new SolidColorBrush(Colors.Gray);

            oplossing.Width = 200;
            oplossing.Text = "";
            oplossing.TextWrapping = TextWrapping.Wrap;
            oplossing.Foreground = new SolidColorBrush(Colors.Gray);
            oplossing.Margin = new Thickness(0, 20, 0, 0);
          
        }

        private void Invoer_MouseLeave(object sender, MouseEventArgs e)
        {
            if (invoer.Text != "")
            {
                try
                {
                    oplossing.Text = "";
                    timer.Stop();
                    List<String> lijst = vragen.Where(k => k.Key.Contains(invoer.Text)).Select(x => x.Value).ToList();
                    foreach (var item in lijst)
                    {
                        oplossing.Text += item + Environment.NewLine + "-" + Environment.NewLine;
                    }
                    invoer.Text = "";
                }
                catch (Exception)
                {
                    oplossing.Text = "Exception";
                }
                finally
                {
                    timer.Start();
                }

            }
        }


        private void Timer_Tick(object sender, EventArgs e)
        {
            oplossing.Text = "";
        }

  

        private void Button_Lock(object sender, RoutedEventArgs e)
        {
            this.WindowStyle = WindowStyle.None;
            tekenplaats.Children.Clear();
            tekenplaats.Children.Add(invoer);
            tekenplaats.Children.Add(oplossing);

        }
        // vragen.Add("","");
        private void voegvragentoe() {
            vragen.Add("A new network policy requires an ACL denying FTP and Telnet access to a Corp file server from all interns. The address of the file server is 172.16.1.15 and all interns are assigned addresses in the 172.18.200.0/24 network. After implementing the ACL, no one in the Corp network can access any of the servers. What is the problem", "Inbound ACLs must be routed before they are processed\nThe ACL is implicitly denying access to all the servers");
            vragen.Add("Router R1 routes traffic to the 10.10.0.0/16 network using an EIGRP learned route from Branch2. The administrator would like to install a floating static route to create a backup route to the 10.10.0.0/16 network in the event that the link between R1 and Branch2 goes down. Which static route meets this goal", "p route 10.10.0.0 255.255.0.0 209.165.200.225 100");

            // ccna 3 

            vragen.Add("Which routing protocol is able to scale for large networks and utilizes non-backbone areas for expansion?", "OSPF");
            vragen.Add("In the Cisco hierarchical design model, which layer is more likely to have a fixed configuration switch than the other layers?", "access");
            vragen.Add("A switched network has converged completely. All switches currently have a VTP revision number of 5. A new switch that has been configured as a VTP server is added to the network. The new switch has a VTP revision number of 4. What will occur within the network?", "... the newly added switch.*");
            vragen.Add("A network administrator is adding a new VLAN for testing. The company uses VTP and the VLAN is not directly attached to either of the switches configured as VTP servers. What is the best method to add this VLAN to the network?", "... to the VLAN database of the VTP servers");
            vragen.Add("Which three pairs of trunking modes will establish a functional trunk link between two Cisco switches? (Choose three.)", "dd-dd* && dd-tr* && dd-da ");
            vragen.Add("Refer to the exhibit. The configuration shows the commands entered by a network administrator for inter-VLAN routing. However, host PCA cannot communicate with PCB. Which part of the inter-VLAN configuration causes the problem?", "VLAN configuration");
            vragen.Add("Refer to the exhibit. What is the role of the SW3 switch", "root bridge");
            vragen.Add("Which spanning tree standard was developed by Cisco to provide separate instances of 802.1w per VLAN?", "Rapid PVST+*");
            vragen.Add("Which industry-wide specification was developed to decrease the time that is needed to move to the forwarding state by switch ports that are operating in a redundantly switched topology?", "RSTP*");
            vragen.Add("Refer to the exhibit. A network administrator is verifying the bridge ID and the status of this switch in the STP election. Which statement is correct based on the command output?", "... value to become the root bridge.*");
            vragen.Add("Refer to the exhibit. Which switching technology would allow data to be transmitted over each access layer switch link and prevent the port from being blocked by spanning tree due to the redundant link?", "EtherChannel*");
            vragen.Add("What are two advantages of EtherChannel? (Choose two.)", "physical links - logical connection.* ");
            vragen.Add("When EtherChannel is implemented, multiple physical interfaces are bundled into which type of logical connection?", "port channel*");
            vragen.Add("When a range of ports is being configured for EtherChannel, which mode will configure LACP on a port only if the port receives LACP packets from another device?", "passive*");
            vragen.Add("A new chief information officer (CIO) has requested implementation of a link-state dynamic routing protocol. Which two routing protocols fulfill this requirement? (Choose two.)", "OSPF*  IS-IS*");
            vragen.Add("Refer to the exhibit. A network administrator is utilizing RIPv1 in the exhibited network topology. What would the router R2 do with a packet that is originating from the 192.168.4.0/24 network and destined for network 172.16.1.0/24?", "both R1 and R3.*");
            vragen.Add("What best describes the operation of distance vector routing protocols?", "directly connected neighbors.*");
            vragen.Add("Which statement defines the speed of convergence of routing protocols?", "routing information.*");
            vragen.Add("What is associated with link-state routing protocols?", "Shortest Path First calculations*");
            vragen.Add("Which two pieces of information are contained within a link-state packet (LSP)? (Choose two.)", "bandwidth* link type*");
            vragen.Add("What is a difference between the routing protocols EIGRP and OSPF?", " only IP-based protocols.*");
            vragen.Add("What protocol is used by EIGRP for the delivery and receipt of EIGRP packets?", "RTP*");
            vragen.Add("How is bandwidth to a destination network calculated by EIGRP?", "the lowest .. along the route*");
            vragen.Add("Refer to the exhibit. A network administrator has attempted to implement a default route from R1 to the ISP and propagate the default route to EIGRP neighbors. Remote connectivity from the EIGRP neighbor routers to the ISP connected to R1 is failing. Based on the output from the exhibit, what is the most likely cause of the problem?", " been issued on R1.*");
            vragen.Add("Refer to the exhibit. Which statement accurately reflects the configuration of routing on the HQ router?", "A static default route was configured on this router.*");
            vragen.Add("Which command would limit the amount of bandwidth that is used by EIGRP for protocol control traffic to approximately 128 Kb/s on a 1.544 Mb/s link?", "ip bandwidth-percent eigrp 100 8*");
            vragen.Add("Which criterion is preferred by the router to choose a router ID?", "the router-id rid command*");
            vragen.Add("What is the effect of entering the network 192.168.10.1 0.0.0.0 area 0 command in router configuration mode?", "OSPF advertisements will include the network on the interface with the IPv4 address 192.168.10.1.*");
            vragen.Add("Which three requirements are necessary for two OSPFv2 routers to form an adjacency? (Choose three.)", "The two routers must include the inter-router link network in an OSPFv2 network command.* && The OSPF hello or dead timers on each router must match. && The link interface subnet masks must match.");
            vragen.Add("Which type of OSPF router connects an OSPF area to non-OSPF routing domains?", "ASBR*");
            vragen.Add("Which function is performed by an OSPF ABR?", "injecting type 3 LSAs into an area*");
            vragen.Add("In  which mode is the area area-id range address mask command issued when multiarea OSPF summarization is being configured?", "router configuration mode*");
            vragen.Add("Refer to the exhibit. What are three resulting DR and DBR elections for the given topology? (Choose three.)", "R3 is DR for segment A.* && R3 is BDR for segment B.*  && R5 is DR for segment B.*");
            vragen.Add("Refer to the exhibit. How did this router learn of the highlighted route in the routing table?", "by receiving an update from another OSPF router that has the default-information originate command configured*");
            vragen.Add("Which command can be used to view OSPF adjacencies with neighboring routers along with the transition state?", "show ip ospf neighbor");
            vragen.Add("Match the description to the EIGRP packet type. (Not all options are used.)", "EIGRP neighbours --> update packets , reliable delivery --> acknowledgement packets , neighbor adjacen --> hello packets , EIGRP QUERY -->reply packets, from neighbours -> query packets");
            vragen.Add("Match each description to its corresponding LSA type. (Not all options are used.)", " an area --> type 2 , betwn area --> type 3, asbrr --> type 4, flooded with an area --> type 1");
            vragen.Add("What is the term that is used for the area of a network that is affected when a device or network service experiences problems?", "failure domain*");
            vragen.Add("What term is used to express the thickness or height of a switch?", "rack unit*");
            vragen.Add("Which configuration changes will increment the configuration revision number on the VTP server?", "configuring or deleting a VLAN or creating a VLAN name*");
            vragen.Add("What are three characteristics of VTP? (Choose three.)", "In the default VTP mode, VLANs can be created and modified on a switch.*&& Switches in VTP server mode store VLANs in the vlan.dat database.* && VTP updates are exchanged across trunk links only.* ");
            vragen.Add("What is the purpose of the vlan.dat file on a switch?", "It holds the VLAN database.*");
            vragen.Add("What eliminates switching loops?", "Spanning Tree Protocol*");
            vragen.Add("A small company network has six interconnected Layer 2 switches. Currently all switches are using the default bridge priority value. Which value can be used to configure the bridge priority of one of the switches to ensure that it becomes the root bridge in this design", "28672*");
            vragen.Add("What is the value used to determine which port on a non-root bridge will become a root port in a STP network?", "the path cost*");
            vragen.Add("Which three STP states were replaced with the RSTP discarding state? (Choose three.)", "listening* && blocking* && disabled*  ");
            vragen.Add("As the network administrator you have been asked to implement EtherChannel on the corporate network. What does this configuration consist of?", "grouping multiple physical ports to increase bandwidth between two switches*");
            vragen.Add("Which command will start the process to bundle two physical interfaces to create an EtherChannel group via LACP?", "interface range GigabitEthernet 0/4 – 5*");
            vragen.Add("A network administrator configured an EtherChannel link with three interfaces between two switches. What is the result if one of the three interfaces is down?", " The remaining two interfaces continue to load balance traffic.* ");
            vragen.Add("When EtherChannel is configured, which mode will force an interface into a port channel without exchanging aggregation protocol packets?", "on*");
            vragen.Add("Refer to the exhibit. A network administrator is reviewing the configuration of switch S1. Which protocol has been implemented to group multiple physical ports into one logical link?", "PAgP*");
            vragen.Add("What is the term used to describe a network topology where the subnets from a major classful network address space are separated from each other by addresses from a different major classful network address?", "discontiguous network*");
            vragen.Add("What type of packets are sent when there is a change in the EIGRP topology?", "triggered bounded update*");
            vragen.Add("Which three pieces of information does a link-state routing protocol use initially as link-state information for locally connected links? (Choose three.)", "the link router interface IP address and subnet mask* , the type of network link* , the cost of that link* ");
            vragen.Add("What indicates to a link-state router that a neighbor is unreachable?", "if the router no longer receives hello packets*");
            vragen.Add("What are three features of EIGRP? (Choose three.)", "establishes neighbor adjacencies* && uses the Reliable Transport Protocol* && supports equal and unequal cost load balancing*");
            vragen.Add("What capability do protocol-dependent modules provide to the EIGRP routing protocol?", "route different Layer 3 protocols*");
            vragen.Add("Which command should be used to configure EIGRP to only advertise the network that is attached to the gigabit Ethernet 0/1 interface?", "network 172.16.23.64 0.0.0.63*");
            vragen.Add("Which command will configure an IPv6 default static route?", "router(config)# ipv6 route ::/0 s0/0/0*");
            vragen.Add("What routing protocol can be configured to load balance across paths with unequal metrics through the use of the variance command?", "EIGRP*");
            vragen.Add("What are two features of a link-state routing protocol? (Choose two.)", "Routers send triggered updates in response to a change.* && Routers create a topology of the network by using information from other routers.*");
            vragen.Add("A router is participating in an OSPFv2 domain. What will always happen if the dead interval expires before the router receives a hello packet from an adjacent DROTHER OSPF router?", "OSPF will remove that neighbor from the router link-state database.*");
            vragen.Add("In an OSPFv2 configuration, what is the effect of entering the command network 192.168.1.1 0.0.0.0 area 0?", "It tells the router which interface to turn on for the OSPF routing process.*");
            vragen.Add("What does the cost of an OSPF link indicate?", "A lower cost indicates a better path to the destination than a higher cost does.*");
            vragen.Add("Which two addresses represent valid destination addresses for an OSPFv3 message? (Choose two.)", "FF02::5* && FE80::42* ");
            vragen.Add("What information is contained in OSPF type 3 LSAs?", "networks reachable in other areas*");
            vragen.Add("refer to the exhibit. For the given topology, what are three results of the OSPF DR and BDR elections? (Choose three.)", "R3 is DR for segment A. R5 is BDR for segment B.* R3 is DR for segment B");
            vragen.Add("Refer to the exhibit. In this scenario, Area 40 cannot be connected directly to Area 0. Which OSPF network type must be configured in Area 1 to connect these areas?​", "virtual link*");
            vragen.Add("Refer to the exhibit. What method can be used to enable an OSPF router to advertise a default route to neighboring OSPF routers?", "Use the default-information originate command on R0-A.*");
            vragen.Add("Refer to the exhibit. A network administrator has configured the OSPF timers to the values that are shown in the graphic. What is the result of having those manually configured timers?", "The R1 dead timer expires between hello packets from R2.*");
            vragen.Add("Refer to the exhibit.A network administrator has configured OSPFv2 on the two Cisco routers as shown. The routers are unable to form a neighbor adjacency. What should be done to fix the problem?", "Implement the command no passive-interface Serial0/1.");
            vragen.Add("A network administrator has configured an EtherChannel between two switches that are connected via four trunk links. If the physical interface for one of the trunk links changes to a down state, what happens to the EtherChannel?", "The EtherChannel will remain functional.*");
            vragen.Add("Which mode configuration setting would allow formation of an EtherChannel link between switches SW1 and SW2 without sending negotiation traffic?", "SW1: on SW2: on * ");
            vragen.Add("Which two statements are correct about EIGRP acknowledgment packets? (Choose two.)", "The packets are sent as unicast.* && The packets are unreliable.* ");
 /* hier */ vragen.Add("A set of switches is being connected in a LAN topology. Which STP bridge priority value will make it least likely for the switch to be selected as the root?", " 61440* "); //hier
            vragen.Add("A network administrator is analyzing the features that are supported by different first-hop router redundancy protocols. Which statement describes a feature that is associated with HSRP?", "HSRP uses active and standby routers.*");
            vragen.Add(" The graphic shows the following information: Switch S1 (the root bridge) uses a port that is labeled B to connect to switch S3 on a port labeled D. S3 is connected to switch S2 on a port labeled A. S2 uses a port labeled C to connect to S1. S2 is connected also to three PC workstations labeled A, B, and C.Refer to the exhibit. What are the possible port roles for ports A, B, C, and D in this RSTP-enabled network? ", "alternate, designated, root, root*");
            vragen.Add("Refer to the exhibit. What are two results of issuing the displayed commands on S1, S2, and S3? (Choose two.)", " if S1 fails. && S1 will  be the lowest*. ");
            vragen.Add("Which statement describes a characteristic of OSPF external routes?", "cost of the route is being calculated.*");
            vragen.Add("By default, how many equal cost routes to the same destination can be installed in the routing table of a Cisco router?", "4*");
            vragen.Add("An EIGRP router loses the route to a network. Its topology table contains two feasible successors to the same network. What action will the router take?", "immediately inserted into *");
            vragen.Add("A network administrator is analyzing first-hop router redundancy protocols. What is a characteristic of VRRPv3?", "It supports IPv6 and IPv4 addressing.*");
            vragen.Add("What is the function of STP in a scalable network?", "It disables redundant paths to eliminate Layer 2 loops.*");
            vragen.Add("When should EIGRP automatic summarization be turned off?", "when a network contains discontiguous network addresses*");
            vragen.Add("Which characteristic would most influence a network design engineer to select a multilayer switch over a Layer 2 switch?", "ability to build a routing table*");
            vragen.Add("What are two features of OSPF interarea route summarization? (Choose two.)", "summarized by the ABR && routes into the backbone.* ");
            vragen.Add("Refer to the exhibit. Which two conclusions can be derived from the output? (Choose two.)", " 192.168.1.8/30.* &&  The neighbor 172.16.6.1 reach the 192.168.1.0/24 network.* ");
            vragen.Add("What are the only two roles that permit an OSPF router to be configured for summarization? (Choose two.)", "autonomous system boundary router* area border router * ");
            vragen.Add("A network engineer examining the operation of EIGRP on a router notices that one particular route is in an active state. What can the engineer determine about this route?", "EIGRP query messages are being sent to other routers requesting paths to this network.*");
            vragen.Add("A router needs to be configured to route within OSPF Area 0. Which two commands are required to accomplish this? (Choose two.)", "area 0 && router ospf 1");
            vragen.Add("Refer to the exhibit. What are three resulting DR and BDR elections for the given topology? (Choose three.)", "R4 is BDR for segment B.* && R5 is DR for segment B.* && R2 is BDR for segment A.* ");
            vragen.Add("Which statement is true about the states of the IEEE 802.1D Spanning Tree Protocol?", "Ports listen and learn before going into the forwarding state.*");
            vragen.Add("What is one reason to use the ip ospf priority command when the OSPF routing protocol is in use?", "to influence the DR/BDR election process");
            vragen.Add("A network administrator is configuring EIGRP load balancing with the commands:     Router(config)# router eigrp 1  outer(config - router)# variance 3 Router(config - router)# end What is a direct result of entering these commands", "3 times that of the successor,* ");
            vragen.Add("What are two load-balancing methods in the EtherChannel technology? (Choose two.)", "source IP to destination IP* && source MAC to destination MAC*");
            vragen.Add("Which statement describes the autonomous system number used in EIGRP configuration on a Cisco router?", " It functions as a process ID in the operation of the router.* ");
            vragen.Add("An administrator was troubleshooting a router-on-a-stick topology and concluded that the problem was related to the configuration of VLANs on the router subinterfaces. Which two commands can the administrator use in the router to identify the problem? (Choose two.)", "show running-config* show ip interface*");
            vragen.Add("What is a key distinction between classful and classless routing protocols?", "Classful routing protocols do not send subnet mask information in their routing updates.*");
            vragen.Add("Refer to the exhibit. The network administrator configures both switches as displayed. However, host C is unable to ping host D and host E is unable to ping host F. What action should the administrator take to enable this communication?", "Configure either trunk port in the dynamic desirable mode.*");
            vragen.Add("Which is a characteristic of EtherChannel?", "STP treats all interfaces in a bundle as a single logical link.*");
            vragen.Add("The topology displays seven routers with four alternative ways to get from source to destination: Path cost for R1-R3-R4-R5-R6-R7 = 29 Path cost for R1-R3-R2-R6-R7 = 42", "R1-R3-R4-R5-R6-R7*");
            vragen.Add("Refer to the exhibit. Which switch will be elected the root bridge and which switch will place a port in blocking mode? ", "SW3 will become the root bridge.* SW4 will get a port blocked.*");
            vragen.Add("Which command can be used by an administrator to display a list of interfaces that are enabled for OSPFv3?", "show ipv6 protocols*");
            vragen.Add("What EIGRP packet type is used by EIGRP routers to discover neighbors on directly connected links?", "Hello*");
            vragen.Add("Refer to the exhibit. All the displayed switches are Cisco 2960 switches with the same default priority and operating at the same bandwidth. Which three ports will be STP designated ports? (Choose three.)", "fa0/13* fa0/21* fa0/10*");
            vragen.Add("How is the router ID for an OSPFv3 router determined?", "the highest IPv4 address on an active interface*");
            vragen.Add("Which step can be taken to ensure that a switch added to the network does not overwrite the VLAN databases on existing switches in the same VTP domain?", "Reset the switch VTP revision number to 0.*");
            vragen.Add("A network administrator is planning to add a new switch to the network. What should the network administrator do to ensure the new switch exchanges VTP information with the other switches in the VTP domain?", " VTP domain name and password on the new switch.*");
            vragen.Add("Refer to the exhibit. A network administrator has configured OSPFv2 on the two Cisco routers as shown. PC1 is unable to communicate with PC2. What should be done to fix the problem?", " 0.0.0.3 ");
            vragen.Add("When the show spanning-tree vlan 33 command is issued on a switch, three ports are shown in the forwarding state. In which two port roles could these interfaces function while in the forwarding state? (Choose two.)", "Designated*Root*");
            vragen.Add("Which two parameters must match on the ports of two switches to create a PAgP EtherChannel between the switches? (Choose two.)", "VLAN information* && Speed*");
            vragen.Add("What is the final operational state that will form between an OSPF DR and a DROTHER once the routers reach convergence?", "Full*");
            vragen.Add("Which command is used to display the bandwidth of an interface on an EIGRP-enabled router?", "show interfaces*");
            vragen.Add("How are externally learned EIGRP routes identified in the routing table?", "EX*");
            vragen.Add("What does the SPF algorithm consider to be the best path to a network?", "The path that includes the fastest cumulative bandwidth links.*");
            vragen.Add("Which protocol does EIGRP use for the transportation of EIGRP packets?", "Reliable Transport Protocol*");
            vragen.Add("What is a function of OSPF hello packets?", "to discover neighbors and build adjacencies between them*");
            vragen.Add("Refer to the exhibit. The configuration shows commands entered by a network administrator for inter-VLAN routing. However, host H1 cannot communicate with H2. Which part of the inter-VLAN configuration causes the problem?", "VLAN configuration*");
            vragen.Add("A network designer is considering whether to implement a switch block on the company network. What is the primary advantage of deploying a switch block?", "will not impact all end users.*");
            vragen.Add("Which address is used by an IPv6 EIGRP router as the source for hello messages?", "the interface IPv6 link-local address*");
            vragen.Add("Which routing table descriptor is used to identify the OSPF networks advertised by type 1 LSAs?", "O*");
            vragen.Add("What does an OSPF area contain?", "routers that have the same link-state information in their LSDBs*");
            vragen.Add("What two values must match between two EIGRP directly connected neighbors to establish and maintain an adjacency? (Choose two.)", "autonomous system number*metric parameters*");
            vragen.Add("When will a router that is running EIGRP put a destination network in the active state?", " feasible successor available*");
            vragen.Add("Refer to the exhibit. Switch SW-A is to be used as a temporary replacement for another switch in the VTP Student domain. What two pieces of information are indicated from the exhibited output? (Choose two.)", "same domain.* && hrough the domain.* ");
            vragen.Add("Refer to the exhibit. Which route or routes will be advertised to the router ISP if autosummarization is enabled?​", "10.0.0.0/8*");
            vragen.Add("What are two reasons to install a single 48-port fixed configuration switch, rather than two 24-port fixed configuration switches, in a wiring closet that supports two classrooms? (Choose two.)", "more ports  && reduced power");
            vragen.Add("What is a characteristic of spanning tree?", "It is enabled by default on Cisco switches.*");
            vragen.Add("A network administrator enters the spanning-tree portfast bpduguard default command. What is the result of this command being issued on a Cisco switch?", " portfast - BPDU.* ");
            vragen.Add("Refer to the exhibit. A network administrator would like to implement dynamic routing within a small network environment as shown in the exhibit. Which routing protocol would be a viable solution?", "EIGRP*");
            vragen.Add("Refer to the exhibit. R1 and R2 are OSPFv3 neighbors. Which address would R1 use as the next hop for packets that are destined for the Internet?", "FE80::21E:BEFF:FEF4:5538*");
            vragen.Add("Refer to the exhibit. What will Router1 do if it receives packets that are destined to network 2001:db8:11:100::/64?", "drop the packets*");
            vragen.Add("Match the order in which the link-state routing process occurs on a router.", " s1 - learn - st2 - eighbour - st3 - lsp * st4 lsps - st5 - topolo");
            vragen.Add("Match the description to the term. (Not all options are used.)","adj can be found , path first - ospf , SOSPF - backbo - link st - topolo");
            vragen.Add("Match the order of precedence to the process logic that an OSPFv3 network router goes through in choosing a router ID. ", "p1 any, p2 loopback , p3 active int, p4 manualy ");
        }
    }
}
