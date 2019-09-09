//
//  ViewController.swift
//  webView
//
//  Created by s.fujimoto on 9/5/1 R.
//  Copyright © 1 Reiwa s.fujimoto. All rights reserved.
//

import UIKit
import WebKit
import SafariServices

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)

        let url = URL(string:"URL")
        if let url = url{
            let vc = SFSafariViewController(url: url)
            present(vc, animated: true, completion: nil)
        }

    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

