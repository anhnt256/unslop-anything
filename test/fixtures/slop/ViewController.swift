import UIKit

final class ViewController: UIViewController {
    private let titleLabel = UILabel()
    private let subtitleLabel = UILabel()

    override func viewDidLoad() {
        super.viewDidLoad()
        titleLabel.font = UIFont.systemFont(ofSize: 17)
        subtitleLabel.font = UIFont(name: "HelveticaNeue", size: 14)
        view.addSubview(titleLabel)
        view.addSubview(subtitleLabel)
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        navigationController?.interactivePopGestureRecognizer?.isEnabled = false
    }
}
